/* HOW TO THREAD IN JAVA
 * 1. By extending the Thread class
 * 2. By implementing the Runnable interface
 * 3. By using the Callable interface and FutureTask class
 * YOUR CLASS MUST BE A INHERITED THREAD CLASS
 * YOUR LOGIC MUST BE CREATED INSIDE THE RUN METHOD(PUBLIC VOID RUN())
 * AND RUN METHOD IS CALLED BY OBJECT.START() METHOD 
 * In this example, we will use the first method to create two threads that print numbers.
 */

class Process1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Process1: "+i);
        }
    }
}
class Process2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Process2: "+i);
        }
    }
}
public class Thread1 extends Thread {
    public static void main(String[] args) {
        Process1 p1=new Process1();
        Process2 p2=new Process2();
        p1.start();
        p2.start();
    }
}