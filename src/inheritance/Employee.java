
package inheritance;
import java.time.*;
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;


    public Employee(String aname,double asalary,int year,int month,int day)
    {
        name=aname;
        salary=asalary;
        hireday=LocalDate.of(year,month,day);
    }
    public String getName()
    {
        return name;
    }
    //!!!!!!!!!!!!!!!!!!!!!
    public String getName2()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public LocalDate getHireday()
    {
        return hireday;
    }
    public void riseSalary(double percent)
    {
       double rise=percent*salary/100;
       salary+=rise;
    }

}

