package exampleDesign.Classes;

import exampleDesign.CSStudent.CSStudent;

public class COMP170Class extends Classes {
    public COMP170Class() {
    super();
    }
    
    @Override
    public void assign(CSStudent student) {
          System.out.print("Adding COMP170... ");
          System.out.printf("Class Added.\n");
    }
}