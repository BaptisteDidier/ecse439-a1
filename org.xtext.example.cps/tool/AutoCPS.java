public class AutoCPS {
	
	public static void main(String[] args) {
		
		CpsStandaloneSetup.doSetup();

        ResourceSet resourceSet = new ResourceSetImpl();

        URI cpsURI = URI.createFileURI(new File("data/program.cps").getAbsolutePath());

        Resource cpsResource = resourceSet.getResource(cpsURI, true);

        Cps cps = (Cps) cpsResource.getContents().get(0);
        Program program = cps.getProgram();
        List<Course> courses = program.getCourses();

        for (Student s : program.getStudents()) {
            Set<Course> completed = new HashSet<>(s.getTaken());
            List<Course> remaining = new ArrayList<>();
            
            for (Course c : courses) {
                if (!completed.contains(c)) remaining.add(c);
            }

            remaining.sort((c1, c2) -> {
                int termOrder1 = c1.getOffered() == Term.FALL ? 0 : c1.getOffered() == Term.BOTH ? 1 : 2;
                int termOrder2 = c2.getOffered() == Term.FALL ? 0 : c2.getOffered() == Term.BOTH ? 1 : 2;
                return termOrder1 != termOrder2 ? termOrder1 - termOrder2 : c1.getYear() - c2.getYear();
            });

            int termIndex = 0;
            while (!remaining.isEmpty()) {
                Semester sem = (termIndex % 2 == 0) ? Semester.FALL : Semester.WINTER;
                PlannedSession session = CpsFactory.eINSTANCE.createPlannedSession();
                session.setTermOrder(termIndex);
                session.setSemester(sem);

                int creditsThisTerm = 0;

                Iterator<Course> it = remaining.iterator();
                while (it.hasNext()) {
                    Course c = it.next();

                    if (!(c.getOffered() == Term.BOTH ||
                          (sem == Semester.FALL && c.getOffered() == Term.FALL) ||
                          (sem == Semester.WINTER && c.getOffered() == Term.WINTER))) {
                        continue;
                    }

                    if ((c.getPrereq() != null && !evalExpr(c.getPrereq(), completed)) ||
                        (c.getCoreq() != null && !evalExpr(c.getCoreq(), completed))) {
                        continue;
                    }

                    if (creditsThisTerm + c.getCredits() > s.getMaxCreditsPerTerm()) continue;

                    session.getProposedCourses().add(c);
                    creditsThisTerm += c.getCredits();
                    completed.add(c);
                    it.remove();
                }

                if (!session.getProposedCourses().isEmpty()) {
                    s.getPlannedSessions().add(session);
                }

                termIndex++;
            }

        }

        URI xmiURI = URI.createFileURI(new File("data/program.xmi").getAbsolutePath());

        Resource xmiResource = resourceSet.createResource(xmiURI);
        xmiResource.getContents().add(cps);
        xmiResource.save(Collections.emptyMap());

        // output the generated schedule to the console as described in the problem description
        System.out.println("=== AutoCPS Schedule ===\n");

        for (Student s : cps.getStudents()) {
            System.out.println("Student: " + s.getName() +
                    " (max " + s.getMaxCreditsPerTerm() + " credits/term)");

            // Taken
            if (s.getTaken() != null && !s.getTaken().isEmpty()) {
                System.out.print("Taken: ");
                for (int i = 0; i < s.getTaken().size(); i++) {
                    Course c = s.getTaken().get(i);
                    System.out.print(c.getNumber());
                    if (i < s.getTaken().size() - 1) System.out.print(", ");
                }
                System.out.println();
            } 
            else {
                System.out.println("Taken: (none)");
            }

            System.out.println();

            List<List<Course>> planned = s.getPlannedSessions();
            if (planned == null || planned.isEmpty()) {
                System.out.println("No planned terms.");
                System.out.println("--------------------------------------------------\n");
                continue;
            }

            for (int termIndex = 0; termIndex < planned.size(); termIndex++) {
                Term termType = (termIndex % 2 == 0) ? Term.FALL : Term.WINTER;
                List<Course> termCourses = planned.get(termIndex);

                int credits = 0;
                for (Course c : termCourses) credits += c.getCredits();

                System.out.println("Term " + (termIndex + 1) + " (" + termType + ") - " + credits + " credits");

                if (termCourses.isEmpty()) {
                    System.out.println("  (no courses)");
                } else {
                    for (Course c : termCourses) {
                        System.out.println("  - " + c.getCode()
                                + " (" + c.getCredits() + " cr, year " + c.getYear()
                                + ", offered " + c.getOffered() + ")");
                    }
                }

                System.out.println();
            }

            System.out.println("--------------------------------------------------\n");
        }

	}
