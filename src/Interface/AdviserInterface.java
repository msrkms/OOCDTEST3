
package Interface;

import MMS.Student;

public interface AdviserInterface {
    public final int MaximumStudent=40;
    public void InputRest();
    public void DisplayRest();
    public void addStudent(Student s);
    public void showDue();
    public void showLowCGPAIds();
    public void showAbsentNames();
    public boolean checkAvailablity();
    
    
    
}
