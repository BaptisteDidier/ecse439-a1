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
	
}