package practice;

public class Demo {


    String E_Name;
    int age;
    int Emp_id;

     static int nextEmpId=1;

    public Demo(String str , int a)
    {
        E_Name=str;
        age=a;
        Emp_id=nextEmpId;
        nextEmpId++;
    }

    public void show()
    {

        System.out.println("The Name is " +E_Name + " age is " + age + " id is " +Emp_id )  ;
    }

    public void showNextId()
    {

        System.out.println("The next id of the employee is " + nextEmpId);
    }

    protected void  finalize()
    {
        --nextEmpId;
    }


}
