package HashMapDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class UseBank {

    public static void main(String[] args) {

        Account obj1 = new Account(101,"Ravi",2100);
        Account obj2 = new Account(102,"Dora",2890);
        Account obj3 = new Account(103,"Rana",1400);

        Bank b = new Bank();

        System.out.println(b.addAccount(obj1));
        System.out.println(b.addAccount(obj2));
        System.out.println(b.addAccount(obj3));

        System.out.println("The deails of id is " +b.getAccount(103));

        System.out.println(b.remAccount(103));

          HashMap<Integer,Account> h = b.getAllAccounts();
          Iterator it = h.entrySet().iterator();

          while (it.hasNext())
          {
              System.out.println(it.next()) ;
          }


    }
}
