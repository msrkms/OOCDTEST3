
package MMS;

public class Student extends Person implements Interface.StudentInterface{

    private int AbsentDays;
    private double Cgpa;
    private double Payable;
    private double Paid;
    
    @Override
    public void inputRest() {
        System.out.print("Input AbsentDays:");
        setAbsentDays(Input.nextInt());
        System.out.print("Input CGPA:");
        setCgpa(Input.nextDouble());
        System.out.print("Input Payable Amount:");
        setPayable(Input.nextDouble());
        System.out.print("Input Paid Amount:");
        setPaid(Input.nextDouble());
    }

    @Override
    public void displayRest() {
        System.out.println("Absent Day:"+getAbsentDays());
        System.out.println("CGPA:"+getCgpa());
        System.out.println("Payable Amount:"+getPayable());
        System.out.println("Paid Amount:"+getPaid());
    }

    public int getAbsentDays() {
        return AbsentDays;
    }

    public void setAbsentDays(int AbsentDays) {
        this.AbsentDays = AbsentDays;
    }

    public double getCgpa() {
        return Cgpa;
    }

    public void setCgpa(double Cgpa) {
        this.Cgpa = Cgpa;
    }

    public double getPayable() {
        return Payable;
    }

    public void setPayable(double Payable) {
        this.Payable = Payable;
    }

    public double getPaid() {
        return Paid;
    }

    public void setPaid(double Paid) {
        this.Paid = Paid;
    }
    
}
