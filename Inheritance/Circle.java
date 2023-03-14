package Inheritance;

public class Circle {

      private int radius;

      public Circle(int radius)
      {
          this.radius = radius;

      }

      public int getRadius()
      {
          return radius;

      }

      public double  area()
      {
          double area = Math.PI*radius*radius;
          System.out.println("The area of Circle is " +area);
          return area;
      }
}

class Cylinder extends  Circle
{
    private int height;

    public Cylinder(int radius , int height)
    {
        super(radius);
        this.height= height;
    }

    public double area()
    {

        double area =  (2*Math.PI*getRadius()*getRadius()*height )+ (2*Math.PI*getRadius() ) ;
        System.out.println("The Area of Cylinder is " + area);
        super.area();
        return area;
    }

    public double volume()
    {
        double vol = Math.PI * Math.pow(getRadius(),2)*height;
        System.out.println("The Volume of Cylinder is " +vol);
        return vol;
    }
}
class UseCylinder
{
    public static void main(String[] args) {

        Cylinder c = new Cylinder(2,4);
        c.area();
        c.volume();


    }
}