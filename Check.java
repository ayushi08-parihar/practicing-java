//WAP to enter any paragraph and check how many vovel consonant space word and character are there in the paragraph
import java.util.Scanner;
class Check  {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any paragraph");
        String str=sc.nextLine();
        int vovel=0,consonant=0,space=0,word=1,character=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                vovel++;
            }
            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                consonant++;
            }
            else if(ch==' ')
            {
                space++;
                word++;
            }
            character++;
        }
        System.out.println("Vowels: "+vovel);
        System.out.println("Consonants: "+consonant);
        System.out.println("Spaces: "+space);
        System.out.println("Words: "+word);
        System.out.println("Characters: "+character);
    }
}