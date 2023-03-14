package Circle;

public class Circle {


    private int rad;

    public void setRadius(int x) {
        rad = x;
    }

    public void calculateArea() {
        System.out.println("The area of Circle is :" + Math.PI * rad * rad);

    }

    public void calculateCircumference() {
        System.out.println("The circumference of circle is : " + 2 * Math.PI * rad);

    }


}
