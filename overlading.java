//create three method 
//one method print only id 3rdv method id and nmae both
class Student
{
int display(int id)
{
    return id;
}
String display(String name)
{
    return name;
}
void display(int id,String name)
{
    return ;
}
}
public class overloading
{
    public static void main(String args[])
    {
         Student obj=new Student();
        System.out.println("ID"+obj.display(9));
        System.out.println("name"+obj.display("AYU"));
        System.out.println("hhhh"+obj.display(9,"Ayu"));
    }
}