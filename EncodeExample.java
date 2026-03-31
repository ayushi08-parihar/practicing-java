import java .util.*;
public class EncodeExample
{ 
    public static void main(String[] args){
    System.out.println("Encoded String"+encoded);
    String encode="QVlV";
    byte[] decodebyte=Base64.getDecoder().decode(encode);
    String str=new String(decodebyte);
    System.out.println("Decoded String"+str);
    }
}