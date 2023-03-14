package Inheritance;
//
//  inheritance means extending the properties of superclass to subclass or we can say in
//  OOps terminolgies the extendting the properties in child from parent class
//
//  benifits of inheritance :
//
//   1. code reusabllity: The code prensent in the parent class can be use directly in child class
//   2. code maintainblity:+++++++++++++++

 public class Num{

     private int x ,y ;

     public Num(int x , int y)
     {
         this.x=x;
         this.y=y;
     }
     public int getX()
     {
         return x;

     }

     public int getY()
     {
         return y;

     }
 }

  class Num2 extends Num
        {
            public Num2(int p , int q)
            {
                super(p , q );
            }

            public void Add()
            {
                int sum = super.getX() + super.getY();
                System.out.println(" The sum is " +sum);

            }

        }

        class UseNum2{
            public static void main(String[] args) {

                Num2 n = new Num2(10,20);
                Num2 n1 = new Num2(30,50);
                Num2 n2 = new Num2(60,80);

                 n.Add();
                 n1.Add();
                 n2.Add();

            }
        }



















