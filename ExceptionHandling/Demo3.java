package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class Demo3 {

    public static void input() throws IOException
    {
//        Scanner sc = new Scanner(System.in.read());

        System.out.println("Enter your character ");

        char c = (char)System.in.read();


        System.out.println(c);
    }

    public static void main(String[] args) throws IOException {

        input();

    }
}




