package exampleDesign.Classes;

import exampleDesign.CSStudent.CSStudent;

public class COMP379Class extends Classes {
    public COMP379Class() {
    super();
    }
    @Override
    public void assign(CSStudent student) {
          System.out.print("Adding COMP379...");
          System.out.printf("Class Added.\n");
    }
}