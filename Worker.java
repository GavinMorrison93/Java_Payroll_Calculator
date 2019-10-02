//In this part of the program we extend the Employee class into the subclass of Worker and
//create the fields: Role, Wage, Netwage and Department, again using the Standard Java Get
//and Set method.

public class Worker extends Employee implements Comparable<Employee>{
    
    public String Role;
    public double Wage;
    public double Netwage;
    public String Dept;

    public Worker(String Name, int EmployeeID, String r, double w, double nw, String d){
    super(Name, EmployeeID);
        setRole(r);
        setWage(w);
        setNetWage(nw);
        setDept(d);
    }
    
    public void setRole(String r){
        Role = r;
    }
    
    public void setWage(double w){
        Wage = w;
    }
          
    public void setDept(String d){
        Dept = d;
    }
    
    public String getRole(){
        return Role;
    }
    
    public double getWage(){
        return Wage;
    }
    
    public double getNetWage(){
        return Netwage;
    }
        
    public String getDept(){
        return Dept;
    }

// This is where we calculate the Netwage of our Workers.
    
    public void setNetWage(double nw){
        Netwage =nw;
        Netwage = Wage - (Wage /100) *20;
    }
    
//Here is a string to string conversion and the first part of the Comparator 
//(with If loop) that will be used to sort Employee's information.

    public String toString()
    {
    return getName() + "\t" +getRole() + "\t\t" +getDept() + "\t\t" + getWage();
    }
    
    public int compareTo(Employee e1)
    {
    int toReturn = 0;
    
    if (this.getWage() < e1.getWage())
    {
    toReturn = -1;
    }
    
    if (this.getWage() > e1.getWage())
    {
    toReturn = 1;
    }
    
    return toReturn;
    }
}
 