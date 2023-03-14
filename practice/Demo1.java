package practice;

public class Demo1 {


    public int sum(int x, int y)
    {
        return x+y;
    }

    public int max (int a , int b)
    {
        if (a>b)
        {
            return a;
        }

        else return b;
    }

    public static void main(String[] args) {

        Demo1 obj = new Demo1();
        int aa = obj.sum(10,20);
        System.out.println(aa);
//        System.out.println("The sum is "+ obj.sum(10,20));
    }

    }

