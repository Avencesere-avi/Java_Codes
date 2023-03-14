package Interface;



 class Circle  implements Shapes {

    int radius;


    public Circle(int radius)
    {
        this.radius=radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }

    public String getName()
    {

        return "The shape is Circle ";
    }
}




 class Rectangle implements Shapes

{

     int l;
     int b;


     public Rectangle(int l , int b)
     {
         this.l=l;
         this.b=b;

     }
    public double area()
    {

        return l*b;
    }


    public String getName()
    {

        return "The shape is Rectangle";
    }
}

class test
{
    public static void main(String[] args) {

        Shapes s = new Circle(5);
        System.out.println("The area is " +s.area());
        s.getName();

        s = new Rectangle(5,10);

        s.area();
        s.getName();


    }
}
