/* public class AutoCPS {
	
	public static void main(String[] args) {
		
		CpsStandaloneSetup.doSetup();

        ResourceSet resourceSet = new ResourceSetImpl();

        URI cpsURI = URI.createFileURI(
            new File("data/program.cps").getAbsolutePath()
        );

        Resource cpsResource = resourceSet.getResource(cpsURI, true);

        Cps cps = (Cps) cpsResource.getContents().get(0);
        Program program = cps.getProgram();
        List<Course> courses = program.getCourses();

        // TODO: assign courses to terms here
        for (Student s : cps.getStudents()) {
        	Set<Course> taken = new HashSet<>(s.getTaken());
        	
            List<Course> remaining = new ArrayList<>();
            for (Course c : courses) {
                if (!taken.contains(c)) {
                    remaining.add(c);
                }
            }
            
            remaining.sort((c1, c2) -> {
                int o1 = c1.getOffered() == Term.FALL ? 0 : c1.getOffered() == Term.BOTH ? 1 : 2;
                int o2 = c2.getOffered() == Term.FALL ? 0 : c2.getOffered() == Term.BOTH ? 1 : 2;

                if (o1 != o2) return o1 - o2;
                return c1.getYear() - c2.getYear();
            });
            
            Map<Integer, Integer> creditsPerTerm = new HashMap<>();
            Set<Course> completed = new HashSet<>(taken);
            
            for (Course c : remaining) {

                for (int termIndex = 0; !remaining.isEmpty(); termIndex++) {
                    Term termType = (termIndex % 2 == 0) ? Term.FALL : Term.WINTER;

                    // Check if course is offered in this term
                    if (!(c.getOffered() == Term.BOTH || c.getOffered() == termType))
                        continue;

                    // Check prerequisites
                    if (c.getPrereq() != null && !evalExpr(c.getPrereq(), completed))
                        continue;

                    int usedCredits = creditsPerTerm.getOrDefault(termIndex, 0);
                    if (usedCredits + c.getCredits() > s.getMaxCreditsPerTerm())
                        continue;

                    // Ensure plannedTerms list is big enough
                    while (s.getPlannedTerms().size() <= termIndex) {
                        s.getPlannedTerms().add(new ArrayList<>());
                    }
                    s.getPlannedTerms().get(termIndex).add(c);

                    creditsPerTerm.put(termIndex, usedCredits + c.getCredits());
                    completed.add(c);
                }
            }
        }

        URI xmiURI = URI.createFileURI(new File("data/program.xmi").getAbsolutePath());

        Resource xmiResource = resourceSet.createResource(xmiURI);
        xmiResource.getContents().add(cps);
        xmiResource.save(Collections.emptyMap());

        // TODO: output the generated schedule to the console as described in the problem description
        System.out.println("TODO");
	}
	
} */

public class AutoCPS {
	
	public static void main(String[] args) {
		
		CpsStandaloneSetup.doSetup();

        ResourceSet resourceSet = new ResourceSetImpl();

        URI cpsURI = URI.createFileURI(
            new File("data/program.cps").getAbsolutePath()
        );

        Resource cpsResource = resourceSet.getResource(cpsURI, true);

        Cps cps = (Cps) cpsResource.getContents().get(0);
        Program program = cps.getProgram();
        List<Course> courses = program.getCourses();

        // TODO: assign courses to terms here
        for (Student s : cps.getStudents()) {
        	Set<Course> taken = new HashSet<>(s.getTaken());
        	
            List<Course> remaining = new ArrayList<>();
            for (Course c : courses) {
                if (!taken.contains(c)) {
                    remaining.add(c);
                }
            }
            
            remaining.sort((c1, c2) -> {
                int o1 = c1.getOffered() == Term.FALL ? 0 : c1.getOffered() == Term.BOTH ? 1 : 2;
                int o2 = c2.getOffered() == Term.FALL ? 0 : c2.getOffered() == Term.BOTH ? 1 : 2;

                if (o1 != o2) return o1 - o2;
                return c1.getYear() - c2.getYear();
            });
            
            Map<Integer, Integer> creditsPerTerm = new HashMap<>();
            Set<Course> completed = new HashSet<>(taken);
            
            for (Course c : remaining) {

                for (int termIndex = 0; !remaining.isEmpty(); termIndex++) {
                    Term termType = (termIndex % 2 == 0) ? Term.FALL : Term.WINTER;

                    // Check if course is offered in this term
                    if (!(c.getOffered() == Term.BOTH || c.getOffered() == termType))
                        continue;

                    // Check prerequisites
                    if (c.getPrereq() != null && !evalExpr(c.getPrereq(), completed))
                        continue;

                    int usedCredits = creditsPerTerm.getOrDefault(termIndex, 0);
                    if (usedCredits + c.getCredits() > s.getMaxCreditsPerTerm())
                        continue;

                    // Ensure plannedTerms list is big enough
                    while (s.getPlannedTerms().size() <= termIndex) {
                        s.getPlannedTerms().add(new ArrayList<>());
                    }
                    s.getPlannedTerms().get(termIndex).add(c);

                    creditsPerTerm.put(termIndex, usedCredits + c.getCredits());
                    completed.add(c);
                    
                    break;
                }
            }
        }

        URI xmiURI = URI.createFileURI(new File("data/program.xmi").getAbsolutePath());

        Resource xmiResource = resourceSet.createResource(xmiURI);
        xmiResource.getContents().add(cps);
        xmiResource.save(Collections.emptyMap());

        // TODO: output the generated schedule to the console as described in the problem description
        //System.out.println("TODO");
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
            } else {
                System.out.println("Taken: (none)");
            }

            System.out.println();

            // Planned terms = the "assignments"
            List<List<Course>> planned = s.getPlannedTerms();
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
                        // show number, name, credits, suggested year, offered
                        System.out.println("  - " + c.getNumber()
                                + " \"" + c.getName() + "\""
                                + " (" + c.getCredits() + " cr, year " + c.getYear()
                                + ", offered " + c.getOffered() + ")");
                    }
                }

                System.out.println();
            }

            System.out.println("--------------------------------------------------\n");
        }

	}
