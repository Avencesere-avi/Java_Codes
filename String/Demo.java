package String;

public class Demo {


    int l;
    int b ;
    int h ;

    public boolean equals(Object obj)

    {

        Demo t = (Demo) obj;
        if (this.l==t.l && this.b==t.b && this.h==t.h)
        {
            return true;
        }

        else {
            return false;
        }

    }

    public Demo(int l , int b , int h)
        {
            this.l=l;
            this.b=b;
            this.h=h;
        }

        public void show()
        {
            System.out.println(l + " " + b + " " + h +" ");
        }

    public static void main(String[] args) {



        Demo d = new Demo(10,20,30);
        Demo d1 = new Demo(10,20,30);

        System.out.println(d.equals(d1));

        // public boolean equals(object) -------> It is inherited from object;

//           When we use equals method the the address are actually compared insted of contents
//                in the objects . so if we want to compare the contents of the object the we have to
//                override the method in the class and implment the logic so that we can compare the
//                object




        // public booleans equalsIgnoreCase(String)--------> it is present in the String class.


//           String s1 = "Ravi";
//           String s2 = "ravi";
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));








    }
}
