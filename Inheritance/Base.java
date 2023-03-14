package Inheritance;

//if we have multiple constructor in base class
public class Base
{

//
    public Base()
    {
        this(0);
        System.out.println("Non Parameterized constructor base is called ");
    }
    public Base(int i)
    {
         this(10,20);
        System.out.println("Single parameteized Constructor base called ");

    }
    public Base(int i , int j )
    {
        System.out.println("Double parameterized Constructor base called ");
    }
}

class Derived extends Base
{
      public Derived()
      {
          this(10);
          System.out.println("Non Parameteized dervied constuctor has been called ");
      }
      public Derived(int i)
      {
          this(20,30);
        System.out.println("Non Parameteized dervied constuctor has been called ");
      }

      public Derived(int i , int j  )
      {
          super();
        System.out.println("Non Parameteized dervied constuctor has been called ");
      }

}

class UseDerived
{
    public static void main(String[] args) {

        Derived obj = new Derived();
    }
}