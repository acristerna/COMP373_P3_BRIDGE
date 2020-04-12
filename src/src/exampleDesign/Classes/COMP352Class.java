package exampleDesign.Classes;
import exampleDesign.CSStudent.CSStudent;

public class COMP352Class extends Classes {
    public COMP352Class() {
    super();
    }
    @Override
    public void assign(CSStudent student) {
          System.out.print("Adding COMP352..."); 
          System.out.printf("Class Added.\n");
    }
}