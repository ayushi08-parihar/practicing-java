class Process1 extends Thread{
    public void run(){
        try{
        for(int i=1;i<=5;i++){
                System.out.println("*");
                Thread.sleep(5);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }
class Process2 extends Thread{
    public void run(){
        try{
        for(int i=1;i<=3;i++){
                System.out.println("^-^");
                Thread.sleep(5);
            }
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    }
    class Process3 extends Thread{
    public void run(){
        try{
        for(int i=1;i<=5;i++){
                System.out.println("#");
                Thread.sleep(5);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }

public class THread extends Thread {
    public static void main(String[] args) {
        Process1 p1=new Process1();
        Process2 p2=new Process2();
        Process3 p3=new Process3();
        p1.start();
        p2.start();
        p3.start();
    }
}