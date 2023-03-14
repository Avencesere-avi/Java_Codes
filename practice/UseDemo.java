package practice;

public class UseDemo {
    public static void main(String[] args) {
        System.out.println("For Permenant Employees ");
        Demo d1 = new Demo("Ravi",20);
        Demo d2 = new Demo("Golu",18);
        Demo d3 = new Demo("Arsh",25);

        d1.show();
        d2.show();
        d3.show();

        System.out.println("For temporary Employees ");
        {
            Demo d4 = new Demo("shiv",57);
            Demo d5 = new Demo("rana",75);
            Demo d6 = new Demo("saurav",69);
            d4.show();
            d5.show();
            d6.show();
            d6.showNextId(); d1.showNextId();
            d4=d5=d6=null;
            System.gc();
            System.runFinalization();

        }

        System.out.println("Intership ENDS");
         d1.showNextId();










    }
}
