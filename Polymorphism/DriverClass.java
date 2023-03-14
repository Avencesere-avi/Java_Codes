package Polymorphism;

public class DriverClass extends Language{
    public static void main(String[] args) {

        Language L = new English();
        L.greeting();

        L = new Hindi();
        L.greeting();

        L = new French();
        L.greeting();

    }
}
