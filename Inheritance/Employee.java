package Inheritance;

public class Employee {

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    private String name;
      private double sal;

      public Employee(String name , double sal)
      {
          this.name=name;
          this.sal=sal;

      }

}

class Manager extends Employee
{
     private double bonus;


     public Manager(String name , double sal , double bonus)
     {
         super(name , sal);
         this.bonus= bonus;

     }

     public void getIncome()
     {
         double Man_Income = super.getSal() + bonus;
         System.out.println(" The Salary of Manager would be : " +Man_Income);

     }
}

class UseManagaer

{
    public static void main(String[] args) {

         Manager boss = new Manager("Ravi " , 10000 , 5000);
         boss.getIncome();

    }
}