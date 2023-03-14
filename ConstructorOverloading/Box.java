package ConstructorOverloading;

//what is Cosntructor  overloading : as just is same as method overloading in which the constructor is many but the no. of argument should be differnet
public class Box

{
    private int num1;
    private int num2;

    private String name ;


    public Box(int x , int y , String z)
    {
        num1=x;
        num2=y;
        name=z;
    }

   public Box(Box P)
   {

      num1 = P.num1;
      num2=P.num2;
      name = P.name;
   }


    public void show ()
    {
        System.out.println("the num 1 is " +num1 + "The num 2 is " +num2 + " the name is " +name);
    }















}
