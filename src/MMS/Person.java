
package MMS;

import java.util.Scanner;

public class Person implements Interface.Person{
    Scanner Input = new Scanner(System.in);
    protected String Id;
    protected String Name;
    protected String ContactNo;
    
    
    @Override
    public void inputAll(){
        System.out.print("Input Id:");
        Id=Input.next();
        System.out.print("Input Name:");
        Name=Input.next();
        System.out.print("Input Contact No:");
        ContactNo= Input.next();
        
        
    }
    
    @Override
    public void displayAll(){
        System.out.println("ID:"+Id);
        System.out.println("Name:"+Name);
        System.out.println("ContactNo:"+ContactNo);
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }
    
    
    
}
