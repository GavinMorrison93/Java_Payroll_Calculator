//In this part of the program we create our Employee class using the standard Java Get
//and Set method. I later added the abstract element to the program to allow me
//flexibility when extending the Employee class.

public abstract class Employee {

    public String Name;
    public int EmployeeID;
   	
    public Employee(String n, int eid) {
        setName(n);
        setEmployeeID(eid);
    }
    public void setName(String n) {
        Name = n;
    }
    public void setEmployeeID(int eid) {
        EmployeeID = eid;
    }
    public String getName() {
        return Name;
    }
    public int getEmployeeID() {
        return EmployeeID;
    }
    abstract double getWage();
    abstract double getNetWage();
}    
    