class Process1 extends Thread{
    public void run(){
        //code for table from 5 to 10
        try{
        for(int i=5;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+(i*j));
                Thread.sleep(2);
            }
        }
        }catch(Exception e){
          System.out.println();}
    }
}
class Process2 extends Thread{
    public void run(){
        //code from table from 10 to 20
        try{
        for(int i=10;i<=20;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+(i*j));
                Thread.sleep(2);
            }
        }
        }catch(Exception e){
          System.out.println();}
    }
}
public class UseJoin extends Thread {
    public static void main(String[] args) {
        Process1 p1=new Process1();
        Process2 p2=new Process2();
        p1.start();
        try{
            p1.join();//until first thread gets suspened till then it print
        }catch(Exception e)
        {
            System.out.println();
        }
        p2.start();
        try{
            p2.join();//until first thread gets suspened till then it print
        }catch(Exception e)
        {
            System.out.println();
        }
        System.out.println("Thread name:"+p1.getName());
        System.out.println("Thread name:"+p2.getName());
        p1.setName("5-10 TABLE");
        p2.setName("10-20 TABLE");
        System.out.println("Thread name:"+p1.getName());
        System.out.println("Thread name:"+p2.getName());
    }
}