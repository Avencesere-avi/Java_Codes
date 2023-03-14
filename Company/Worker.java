package Company;

         public class Worker
         {
               private int hw ;
               private  double payRate;

               public void setData(int x, double y)
               {
                   hw = x;
                   payRate=y;
               }

               public double calculateSalary()
               {
                   if(hw<=40)

                   {
//                   System.out.println("The salary is " + hw*payRate);

                       double sal = hw*payRate;
                       return sal;


                   }

                   else
                   {
//                       System.out.println("The salary is " + 2*hw*payRate);
                       return 2*hw*payRate;
                   }
               }

         }



