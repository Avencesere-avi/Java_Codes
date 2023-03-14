package ArgumentsPassInJava;

//in java there are two types of arguments passing
//first is through  vairable and second is through reference
//but the thinng is that pass technique is only one and that is pass by value and nothing else
//
//    when we pass the variable in the argumetns then the actual value is passing to formal argummetns and its coping the value
//from actual to formal actually the main method has another memory in which it saved its value and on the it its local storage


import java.sql.SQLOutput;
import java.util.Scanner;

public class ArgPassInJava {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the size ");
        int s = kb.nextInt();

        int[] arr = new int[s];

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter digits");
            arr[i]=kb.nextInt();
        }

        int sum=0;

        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("The sum is " +sum);



    }

}










