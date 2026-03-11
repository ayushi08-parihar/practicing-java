import java.io.*;
import java.util.*;
 class File3 {
    public static void main(String[] args) {
            String data=null;
        try{
            FileReader fr=new FileReader("file1.txt");
            Scanner sc=new Scanner(fr);
            while(sc.hasNextLine()){
                data=sc.nextLine();
                System.out.println(data);
            }
            //To count number of words,consonants,vowels in the file
            int wordCount=0, consonantCount=0, vowelCount=0,space=0;
            for(int i=0;i<data.length();i++){
                char c=data.charAt(i);
                if(c==' '){
                    space++;
                    wordCount=space+1;
                }else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    vowelCount++;
                }else if(Character.isLetter(c)){
                    consonantCount++;
                }
            }
      
            System.out.println("Number of words="+wordCount);
            System.out.println("Number of vowels="+vowelCount);     
            System.out.println("Number of consonants="+consonantCount);
            System.out.println("Number of spaces="+space);

            fr.close();
        }catch(Exception e){
            System.out.println("Error="+e.getMessage());
        }
    }
}