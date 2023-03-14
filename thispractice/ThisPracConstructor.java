package thispractice;

public class ThisPracConstructor {

    public ThisPracConstructor()
    {
        this(10,20,30);
        System.out.println("heelo contructor called ");
    }
    public ThisPracConstructor(int x , int y)
    {


    }
    public ThisPracConstructor(int a , int b ,  int c)
    {

        System.out.println("bada wala constuctor called ");

    }

    public static void main(String[] args) {
        ThisPracConstructor t = new ThisPracConstructor(20,30,40);
    }



}
