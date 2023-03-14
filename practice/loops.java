package practice;


import java.util.Scanner;

public class loops {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Enter number");
        int x = sc.nextInt();

        if(x%10==0){
            break;
        }

        else{
            System.out.println("the value is " +x);
        }

    }while (true);



















}
}
