package Main;

import exampleDesign.CSStudent.CSStudent;
import exampleDesign.CSStudent.ComputerScienceStudent;
import exampleDesign.CSStudent.CybersecurityStudent;
import exampleDesign.CSStudent.SoftwareEngineeringStudent;
import exampleDesign.Classes.COMP170Class;
import exampleDesign.Classes.COMP271Class;
import exampleDesign.Classes.COMP352Class;
import exampleDesign.Classes.COMP379Class;

public class Main {
    public static void main(String[] args) {
          CSStudent computerScienceStudent = new ComputerScienceStudent();
          computerScienceStudent.joinClass(new COMP170Class());
          computerScienceStudent.joinClass(new COMP271Class());
          computerScienceStudent.joinClass(new COMP379Class());
          computerScienceStudent.assignClasses();
          
          CSStudent softwareEngineeringStudent = new SoftwareEngineeringStudent();
          softwareEngineeringStudent.joinClass(new COMP170Class());
          softwareEngineeringStudent.joinClass(new COMP271Class());
          softwareEngineeringStudent.assignClasses();
          
          CSStudent cybersecurityStudent = new CybersecurityStudent();
          cybersecurityStudent.joinClass(new COMP170Class());
          cybersecurityStudent.joinClass(new COMP271Class());
          cybersecurityStudent.joinClass(new COMP352Class());
          cybersecurityStudent.assignClasses();
    }
}