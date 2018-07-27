
package MMS;

import java.util.ArrayList;
import java.util.Scanner;

public class MMS {
        static Scanner Input= new Scanner(System.in);
        static  ArrayList<Adviser> advisers=new ArrayList<Adviser>();
        static  ArrayList<Student> students=new ArrayList<Student>();
        
        
        static Adviser[] adv=new Adviser[100];
        static Student[] st=new Student[100];

    public static void main(String[] args) {

        
        while(true){
            System.out.println("1.Admin\n2.Adviser\n0.Exit");
            int choice=Input.nextInt();
            if(choice==1){
                admin();
            }else if(choice==2){
                adviser();
            }else if(choice==0){
                
                break;
            }
            else{
                System.out.println("Wrong Choice");
            }
        }
    }
    
    public static void adviser(){
        for (int i = 0; i < advisers.size(); i++) {
            System.out.println(i+"ID:"+advisers.get(i).getId());
        }
        System.out.println("Select Adviser:");
        int adviserindex=Input.nextInt();
        boolean loop=true;
        while(loop){
            System.out.println("1.ShowDue\n2.ShowLowCGPA\n3.Show Abesnt Student \n0.Back");
            int choice=Input.nextInt();
            switch(choice)
            {
             case 1:
             {
                 advisers.get(adviserindex).showDue();
                 break;
             }
             case 2:
             {
                  advisers.get(adviserindex).showLowCGPAIds();
                 break;
             }
             case 3:
             {
                  advisers.get(adviserindex).showAbsentNames();
                  break;
             }
             case 0:
             {
                 loop=false;
                 break;
             }
             default:
                 System.out.println("Try again");
            }
        }
        
    }
    
    public static void admin(){
        boolean loop=true;
        while(loop){
            System.out.println("1.Add Student\n2.Add Adviser \n3.Assin Studnt to Adviser \n0.Back");
            int choice=Input.nextInt();
            switch (choice){
                case 1:
                {
                    addStudent();
                    break;
                }
                case 2:
                {
                    addAdviser();
                    break;
                }
                case 3:
                {
                    asssignStudentToAdviser();
                    break;
                }
                case 0:
                {
                    loop=false;
                    break;
                }
                default:
                    System.out.println("Wrong Choice");
                    
                                
            }
        }
        
    }
    
    public static void asssignStudentToAdviser(){
        
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i+".Student Id:"+students.get(i).getId());
        }
        System.out.println("Select Student:");
        int student=Input.nextInt();
        
        for (int i = 0; i < advisers.size(); i++) {
            System.out.println(i+"Adviser Id:"+advisers.get(i).getId());
        }
        System.out.println("Select Adviser:");
        int adviser=Input.nextInt();
        if(advisers.get(adviser).checkAvailablity()){
            advisers.get(adviser).addStudent(students.get(student));
            System.out.println(students.get(student).getId()+" is now under advising of "+advisers.get(adviser).getId());
        }else{
            System.out.println("This Adviser has maximum student");
        }
        
    }
    
    public static void addStudent(){
        System.out.println("Input Student Info:");
        Student obj=new Student();
        obj.inputAll();
        obj.inputRest();
        students.add(obj);
        
    }
    
    public static void addAdviser(){
        System.out.println("Input Adviser Info:");
        Adviser obj=new Adviser();
        obj.inputAll();
        obj.InputRest();
        advisers.add(obj);
    }
    
}
