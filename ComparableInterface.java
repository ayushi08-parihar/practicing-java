import java.util.*;
class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;
    Employee(int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    public int compareTo(Employee emp)
    {
        if(salary==emp.salary)
            return 0;
        else if(salary>emp.salary)
            return 1;
        else
            return -1;
    }
}
class ComparableInterface{
    public static void main(String args[])
    {
       ArrayList<Employee> emplist = new ArrayList<Employee>();
       emplist.add(new Employee(1,"RAM",50000));
       emplist.add(new Employee(2,"SHYAM",60000));
       emplist.add(new Employee(3,"MOHAN",55000));
       emplist.add(new Employee(4,"RAHUL",70000));
       emplist.add(new Employee(5,"RAKESH",45000));
       System.out.println("ID\tNAME\tSALARY");
         for(Employee emp:emplist)
         {
              System.out.println(emp.id+"\t"+emp.name+"\t"+emp.salary);
         }
         Collections.sort(emplist);
            System.out.println("\nSorted by Salary:");
         System.out.println("ID\tNAME\tSALARY");
         for(Employee emp:emplist)
         {
              System.out.println(emp.id+"\t"+emp.name+"\t"+emp.salary);
         }   
        

    }
}