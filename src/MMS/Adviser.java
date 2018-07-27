
package MMS;

import Interface.StudentInterface;

public class Adviser extends Person implements Interface.AdviserInterface{
    private int NumberOfStudent=0;
    private Student[] students=new Student[MaximumStudent];
    
    @Override
    public void InputRest() {
        
    }

    @Override
    public void DisplayRest() {
        System.out.println("Number Of Student:"+NumberOfStudent);
    }

    @Override
    public void addStudent(Student s) {
        if(NumberOfStudent<=MaximumStudent){
            students[NumberOfStudent]=s;
            NumberOfStudent++;
        }else{
            System.out.println("Adviser Have Maximum Student");
        }
        
    }

    @Override
    public void showDue() {
        
        System.out.println("Students:");
        for (int i = 0; i < NumberOfStudent; i++) {
            System.out.println(i+".Student ID"+students[i].getId());
        }
        System.out.print("Select Index:");
        int index=Input.nextInt();
        if(index>=0 && index<NumberOfStudent){
            System.out.println("Payable:"+students[index].getPayable());
            System.out.println("Paid:"+students[index].getPaid());
            System.out.println("Due:"+(students[index].getPayable()-students[index].getPaid()));
        }else{
            System.out.println("Try Again:");
        }
    }

    @Override
    public void showLowCGPAIds() {
        System.out.println("CGPA Less Than 3.0");
        int j=0;
        for (int i = 0; i < NumberOfStudent; i++) {
            if(students[i].getCgpa()<3.00){
                j++;
                System.out.println(j+".ID:"+students[i].getId());
            }
        }
    }

    @Override
    public void showAbsentNames() {
        System.out.println("Abesnt More Than 10 Days");
        int j=0;
        for (int i = 0; i < NumberOfStudent; i++) {
            if(students[i].getAbsentDays()>10){
                j++;
                System.out.println(j+".Name:"+students[i].getName());
            }
        }
    }

    public int getNumberOfStudent() {
        return NumberOfStudent;
    }

    public void setNumberOfStudent(int NumberOfStudent) {
        this.NumberOfStudent = NumberOfStudent;
    }

    @Override
    public boolean checkAvailablity() {
        if(NumberOfStudent<=MaximumStudent)
            return true;
        return false;
    }
    
}
