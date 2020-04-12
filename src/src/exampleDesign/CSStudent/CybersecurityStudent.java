package exampleDesign.CSStudent;

public class CybersecurityStudent extends CSStudent {
      @Override
      public void assignClasses() {
            System.out.println("Adding Major classes needed for a Cybersecurity Student");
            AddedClass.stream().forEach(classes -> classes.assign(this));
            System.out.println("Done.");
            System.out.println();
      }

}