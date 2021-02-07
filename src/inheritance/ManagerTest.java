package inheritance;

public class ManagerTest {




    public static  void main(String []args)
    {
    Manager boss=new Manager("zbs",16000,1999,8,11);
    boss.setBonus(5000);
    Employee []staff=new Employee[3];
    staff[0]=boss;
    staff[1]=new Employee("ASD",123,1999,12,14);
    staff[2]=new Employee("asd",123,1289,11,23);
    for(Employee e:staff)
    {
        System.out.println("name="+e.getName()+"salary is"+e.getSalary());
    }


    }
}
