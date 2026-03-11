import java.io.*;
 class file2 {
    public static void main(String[] args) {
        try{
            FileWriter fo=new FileWriter("file1.txt");
            fo.write("Hello World");
            fo.write("Welcome to Java");
            System.out.println("Data written to file successfully");
                fo.close();
          
    
        }catch(Exception e){
            System.out.println("Error="+e.getMessage());
        }
    }
}