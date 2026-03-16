import java.io.*;
class File {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello Java File \n");
            fw.close();
            FileWriter fo = new FileWriter("data1.txt");
            fo.write("\t Hello this is second java file");
            fo.close();

            FileReader fr = new FileReader("data.txt");
            FileReader f = new FileReader("data1.txt");
         
            FileWriter fi= new FileWriter("destination.txt"); // file to write

             int ch;

            // Read first file
            while((ch = fr.read()) != -1) {
                fi.write(ch);
                System.out.print((char)ch);
            }
            // Read second file
            while((ch = f.read()) != -1) {
                fi.write(ch);
                System.out.print((char)ch);
            }
            System.out.println("Data from both files written to output file."); 
           
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}