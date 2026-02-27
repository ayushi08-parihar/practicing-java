class Exam
{
    int id;
    String name;
    Exam()
    {
        System.out.println("this is constructor");
        id=101;
        name="AYU";
        System.out.println("ID="+id);
        System.out.println("NAME="+name);
    }
    Exam(int i,String name)//PARAMETERIZED CONSTRUCTOR
    {
        id=i;
        this.name=name;
        System.out.println("ID="+id);
        System.out.println("NAME="+name);
    }
    //COPY CONSTRUCTOR
    Exam(Exam obj)
    {
        
        this.id=obj.id;
        this.name=obj.name;
        System.out.println("ID="+id);
        System.out.println("NAME="+name);
    }
}
public class UseConstructor{
    public static void main(String args[]){
        Exam exam=new Exam();
        Exam exam2=new Exam(102,"DAMU");
        Exam exam3=new Exam();//this will print default constructor value
        Exam exam4=new Exam(exam2);
    }
}