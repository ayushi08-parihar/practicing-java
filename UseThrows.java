import java .io.*;
public class UseThrows {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //try{
        System.out.println("Enter a name");
        String name=br.readLine();
        System.out.println("Name is: "+name);
       // } catch(Exception e) {
         //   System.out.println("An error occurred: " + e.getMessage()); 
       // }
       
    }
}