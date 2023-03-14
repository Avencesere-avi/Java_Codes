public class ravi {

    private int age;
    private String name;

    public ravi(int age ,  String name)
    {

        this.age=age;
        this.name=name;

        System.out.println(age +" " +name);

    }
}

class ravi1 extends ravi{

    public ravi1()
    {
        super(10, "ravi ");
    }
}

class test
{
    public static void main(String[] args) {

        ravi1 r = new ravi1();
    }
}