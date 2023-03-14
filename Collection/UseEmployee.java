package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UseEmployee {

    public static void main(String[] args) {

        ArrayList<Employee> e = new ArrayList<>();

        Employee e1 = new Employee(20, "Ravi", 50000);
        Employee e2 = new Employee(25, "Depender", 60000);
        Employee e3 = new Employee(22, "Shivraj", 70000);
        Employee e4 = new Employee(23, "Arsalan", 80000);

        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);


        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i));
        }

        Collections.sort(e);

        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i));
        }

    }

}
