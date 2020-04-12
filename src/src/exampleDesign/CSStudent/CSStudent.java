package exampleDesign.CSStudent;

import java.util.ArrayList;
import java.util.List;
import exampleDesign.Classes.Classes;

public abstract class CSStudent {
	
        // assempbly line for the workshops
      protected List<Classes> AddedClass = new ArrayList<Classes>();
      public CSStudent() {
      super();
      }
      public boolean joinClass(Classes classes) {
      return AddedClass.add(classes);
    		  
      }
      public abstract void assignClasses();
      
}