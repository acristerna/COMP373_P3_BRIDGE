package exampleDesign.CSStudent;

public class SoftwareEngineeringStudent extends CSStudent {
     
	@Override
      public void assignClasses() {
            System.out.println("Adding Major classes needed for a Software Engineering Student");
            AddedClass.stream().forEach(classes -> classes.assign(this));
            System.out.println("Done.");
            System.out.println();
      }
}