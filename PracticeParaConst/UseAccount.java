package PracticeParaConst;

import java.util.Scanner;

public class UseAccount {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

         Account [] obj = new Account[2];
         for (int i=0; i<obj.length; i++)
         {

        System.out.println("Enter Account id ");
        int a = kb.nextInt();

        System.out.println("Enter Name  ");
        String b = kb.next();

        System.out.println("Enter Balance  ");
        double c = kb.nextDouble();

         obj[i]= new Account(a,b,c);

         }

         for (int i=0; i<obj.length; i++)
         {
              obj[i].show();
         }

//         for (Account a:obj)
//         {
//             a.show();
//         }

//        System.out.println("Enter Account id ");
//        int a = kb.nextInt();
//
//        System.out.println("Enter Name  ");
//        String b = kb.next();
//
//        System.out.println("Enter Balance  ");
//        double c = kb.nextDouble();
//
//        new Account(a,b,c).show();


    }
}
