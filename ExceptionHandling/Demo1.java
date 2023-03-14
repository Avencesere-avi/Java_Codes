package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArithmeticException;

 class NumeratorShNotBeZero extends Exception
 {

     public NumeratorShNotBeZero(String str)
     {
         super(str);
     }


 }

 public  class Demo1 {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         int a = 0, b = 0;

         System.out.println("Enter your number ");


         try {

             a = sc.nextInt();

             b = sc.nextInt();


             int c = a / b;

             if (a == 0) {
                 NumeratorShNotBeZero ex = new NumeratorShNotBeZero("Numerator should not be zero");
                 throw ex;
             }

             System.out.println("The divison is " + c);


         } catch (NumeratorShNotBeZero | ArithmeticException  |InputMismatchException ex) {
             System.out.println(ex);
         }
//         } catch ( ex) {
//             System.out.println(" Deno should not be zero ");
//             System.exit(0);
//         }

         finally {
             System.out.println(" kxh bhi ho jae mai to chalunga hi ");
         }
     }
 }