public class AutoCPS {
	
	public static void main(String[] args) {
		
		CpsStandaloneSetup.doSetup();

        ResourceSet resourceSet = new ResourceSetImpl();

        URI cpsURI = URI.createFileURI(
            new File("data/program.cps").getAbsolutePath()
        );

        Resource cpsResource = resourceSet.getResource(cpsURI, true);

        Cps cps = (Cps) cpsResource.getContents().get(0);

        // TODO: assign courses to terms here
        for (Student s : cps.getStudents()) {
            
        }

        URI xmiURI = URI.createFileURI(
            new File("data/program.xmi").getAbsolutePath()
        );

        Resource xmiResource = resourceSet.createResource(xmiURI);
        xmiResource.getContents().add(cps);
        xmiResource.save(Collections.emptyMap());

        System.out.println("Need to print program like described");
	}
	
}