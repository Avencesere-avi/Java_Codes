package Inheritance;//
//Why we override method of super class in sub class
//
//sometime we want to execute the super method rather than sub class method but due to same name of method in both classed actually the method of subclass
//overshadaow the mehtod of super class.
// then here we use super . method name ( list of arguments )

   public class Base1
   {

    public void show(int a)
    {
        System.out.println("  Int argumenet of Base class " + a);
    }

    public void show(String str)
    {
        System.out.println("  String argumenet of Base class " + str);
    }

   }





            class Derived2 extends  Base1
            {


                public  void show (double b)
                {

                    System.out.println(" double argumenet of Derived class " + b);
                }

                public void show(int a)
                {

                    System.out.println("  Int argumenet of Derived class " + a);
                }


            }


            class UseBase1
            {
                public static void main(String[] args)
                {

                    Base1 B = new Base1();
//                    B.show(2.55555);
                    B.show(5);
                    B.show("hello");

                }
            }




















