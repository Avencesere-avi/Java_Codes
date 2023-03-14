package Collection;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {

        HashSet <String> month = new HashSet <>();

        month.add("January");
        month.add("February");
        month.add("February");


        System.out.println(month);


//        System.out.println("USing via Iterator");
//        Iterator <String> it = month.iterator();
//
//
//        while(it.hasNext())
//        {
//            String str = it.next();
//            System.out.println(str);
//        }




    }
}
