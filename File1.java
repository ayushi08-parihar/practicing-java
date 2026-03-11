import java .io.*;
public class File1 {
    public static void main(String[] args) {
        try{
            File fo=new File("file1.txt");
            if(fo.createNewFile()){
                System.out.println("File created successfully");
            }else{

                System.out.println("File not created");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}