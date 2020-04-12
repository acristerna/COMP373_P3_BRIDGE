package exampleDesign.Classes;

import exampleDesign.CSStudent.CSStudent;
public class COMP271Class extends Classes {
      public COMP271Class() {
          super();
      }
      @Override
      public void assign(CSStudent student) {
          System.out.print("Adding COMP271...");
          System.out.printf("Class Added.\n");
      }
}
