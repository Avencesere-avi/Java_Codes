package Company;

import java.util.Scanner;

public class UseWorker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hw");
        int hw=sc.nextInt();

        System.out.println("Enter Payrate");
        double payRate=sc.nextDouble();

        Worker w = new Worker();
//        w.setData(hw,payRate);
//        w.calculateSalary();

        double a;
        a=w.calculateSalary();

        System.out.println(a);
    }
}
