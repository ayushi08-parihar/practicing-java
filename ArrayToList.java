import java .util.*;

public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C++"};
        System.out.println(Arrays.toString(array));
        //Converting array to list
        List<String> list = new ArrayList<String>();
        for(String lang:array)
        {
            list.add(lang);
        }
        System.out.println(list);

    }
}