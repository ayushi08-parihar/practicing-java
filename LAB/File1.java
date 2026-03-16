import java.io.*;

class File1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("java.txt");
            fw.write("Java File1" );
            fw.close();
             FileWriter fw1 = new FileWriter("java1.txt");
            fw1.write(" Java File2");
            fw1.close();
             FileWriter fw2 = new FileWriter("java2.txt");
            fw2.write(" Java File3");
            fw2.close();
             FileWriter fw3 = new FileWriter("java3.txt");
            fw3.write(" Java File4");
            fw3.close();

            FileReader fr = new FileReader("java.txt");
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            fr.close();
            FileReader fr1 = new FileReader("java1.txt");
            int j;
            while((j = fr1.read()) != -1) {
                System.out.print((char)j);
            }
            fr1.close();
            FileReader fr2 = new FileReader("java2.txt");
            int k;
            while((k = fr2.read()) != -1) {
                System.out.print((char)k);
            }
            fr2.close();
            FileReader fr3 = new FileReader("java3.txt");
            int m;
            while((m = fr3.read()) != -1) {
                System.out.print((char)m);
            }
            fr3.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}