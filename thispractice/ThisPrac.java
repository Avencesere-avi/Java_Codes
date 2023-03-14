package thispractice;

public class ThisPrac {
    int l ;
    int b;
    int h;

    public ThisPrac(int l , int b , int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;

    }

    public void  show()
    {
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);

    }



//    public ThisPrac(int a, String s, double sal) {
//        a = a;
//        s = s;
//        sal = sal;
//
//        System.out.println("The display is :" + a + " " +s );
//    }
//
//    public void show()
//    {
//        System.out.println("The display 2 is " + a + " " +s );
//    }

    public static void main(String[] args) {

        ThisPrac t = new ThisPrac(10,20,30);

        t.show();

    }
}
