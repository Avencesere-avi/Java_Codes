package String;

public class Demo2 {

    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("Sachin");

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.reverse();

        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());





    }
}
