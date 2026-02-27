abstract class Shape {
    abstract void display();
}
class Circle extends Shape {
    void display() {
        System.out.println("This is a circle");
    }
}
class Rectangle extends Shape {
    void display() {
        System.out.println("This is a rectangle");
    }
}

public class UseAbstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.display();

        Shape s2 = new Rectangle();
        s2.display();
    }
}