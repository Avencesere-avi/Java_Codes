package Collection;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet1Demo {

    public static void main(String[] args) {


        TreeSet<Integer> hs = new TreeSet<>();
        hs.add(10);
        hs.add(15);
        hs.add(18);
        hs.add(16);
        hs.add(17);
        hs.add(12);
        hs.add(11);

        System.out.println(hs);
        System.out.println("The first element will be : " +hs.first());
        System.out.println("The last element will be : " +hs.last());
        System.out.println("The lower  element will be : " +hs.lower(12));
        System.out.println("The Higher  element will be : " +hs.higher(12));


    }
}
