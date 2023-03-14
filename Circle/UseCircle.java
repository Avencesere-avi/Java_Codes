package Circle;
import java.util.*;
public class UseCircle {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        int rad = kb.nextInt();

        Circle c = new Circle();
        c.setRadius(rad);
        c.calculateArea();
        c.calculateCircumference();

    }
}
