class Myclass{
    @Deprecated
    public int addvalue(int a, int b){
        return a+b;
    }
    public int addNumber(int a, int b){
        return a+b;
    }
    public void Allahabad(){
        System.out.println("Allahabad is a city in India.");
    }
    public void Prayagraj(){
        System.out.println("Prayagraj is the new name of Allahabad.");
    }   
}

public class DepricatedAnnotation {
    public static void main(String[] args) {
        Myclass myclass = new Myclass();
        int result = myclass.addvalue(5, 10);
        System.out.println("Result: " + result);
        myclass.Allahabad();

    }
}