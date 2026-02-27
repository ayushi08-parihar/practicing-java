class Vehicle{
    void run(){
        System.out.println("running");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("running fast");
    }
}
class Bicycle extends Vehicle{
    void run(){
        System.out.println("running slow");
    }

}

public class UseMethodOverRidding{
    public static void main(String[] args){
        Bike car=new Bike();
        car.run();

        Vehicle obj=new Bicycle();
        obj.run();
    }
}