class Bank{
    double getInterst(){
        return 0;
    }
}
class SBI extends Bank{
    double getInterst(){
        return 4.5;
    }
}
class PNB extends Bank{
    double getInterst(){
        return 4.8;
    }
}
class HDFC extends Bank{
    double getInterst(){
        return 5.6;
    }
}
public class UseMethodOverRidding2{
    public static void main(String[] args){
        Bank obj=new HDFC();
        System.out.println("Interst Rate="+obj.getInterst());+,
    }
}