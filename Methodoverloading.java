class Shape
{
    double area(double radius)
    {
        return Math.PI*(radius*radius);
    }
    double area(int length,int breadth)
    {
        return length*breadth;
    }
    double area(double base,double height)
    {
        return 0.5*base*height;
    }
}
public class Methodoverloading{
    public static void main(String args[])
    { 
        Shape obj=new Shape();
        System.out.println("AREA OF CIRLE"+obj.area(9));
        System.out.println("AREA OF RECTANGLE"+obj.area(7,8));
        System.out.println("AREA OF TRIANGLE"+obj.area(6.0,8));
    }
}