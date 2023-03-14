package Collection;

import java.util.*;

public class Employee implements Comparable {


    private int age;
    private String name;
    private double sal;


    public Employee(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }


    public String toString() {
        return age + " " + name + " " + sal;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age && Double.compare(employee.sal, sal) == 0 && name.equals(employee.name);
    }


    @Override
    public int compareTo(Object o) {

        Employee temp = (Employee) o;

        if (this.age > temp.age) {
            return 1;
        } else if (this.age < temp.age) {
            return -1;
        } else return 0;
    }

}

