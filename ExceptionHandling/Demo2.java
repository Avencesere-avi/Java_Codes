package ExceptionHandling;

import java.util.Date;

public class Demo2 {

    private int age;
    private String name;

    public Demo2(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString()
    {
        return name +" " + age;
    }

    public static void main(String[] args) {

        Demo2 d1 = new Demo2(20, "Ravi");
        System.out.println(d1);


        Date d = new Date();
        System.out.println(d);


    }
}
