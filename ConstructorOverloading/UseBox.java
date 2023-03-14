package ConstructorOverloading;

import java.util.Scanner;

public class UseBox {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter your Roll number ");
         int x = sc.nextInt();

         System.out.println("Enter your age ");
         int y = sc.nextInt();

         System.out.println("Enter your Name ");
         String z = sc.next();

         Box b1 = new Box(1,2,"ravi");
         Box b2 = new Box(b1);

         b1.show();
         b2.show();
    }
}
