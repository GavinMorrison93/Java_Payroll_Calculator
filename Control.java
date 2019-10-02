//This is he part of the program where we create the instances to be processed and import
//the Java utilities that are going to assist us in our task.

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;

public class Control {
public static void main(String[] args) {

//This is our array containing our Employee information.

ArrayList<Employee> al = new ArrayList<Employee>();
Employee workerOne = new Worker("Clive", 12345678, "Worker", 33000, 33000, "Sales");
Employee workerTwo = new Worker("Mary", 123456780, "Worker", 35000, 35000, "Sales");
Employee managerOne = new Manager("Robert", 12345679, "Manager", 38000, 38000, "Sales");
Employee managerTwo = new Manager("Deirdre", 12345681, "Manager", 40000, 40000, "Sales");

al.add(workerOne);
al.add(workerTwo);
al.add(managerOne);
al.add(managerTwo);

//This is the header information for our final print.

System.out.println("Name\tRole\t\tDepartment\tWage");

//This is the last stage in our sorting process

Employee[] employeeArray = null;
employeeArray = al.toArray(new Employee[0]);

Arrays.sort(employeeArray);

    for (Employee e : employeeArray)
    {

//This is the print of our Employee information in order of increasing salary.

    System.out.println(e);
    }
    
    Collections.sort(
    al, new Comparator<Employee>()
    {
    @Override
    public int compare(Employee e1, Employee e2)
    {
    return Double.compare(e1.getNetWage() , e2.getNetWage());
    }
    }
    );
    
//This is a separator line between the print of our two sets of information.

    System.out.println("-----------------------------------------------");
    
//This is the print of our Employees names and net wage in order of increasing value.

    System.out.println("Name\t\tNetWage");

    for (Employee e: al)
    {
    System.out.println(e.getName() + "\t\t" + e.getNetWage());
    }
}
}