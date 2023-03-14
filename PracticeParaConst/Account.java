package PracticeParaConst;

public class Account {

       private  int accid ;
       private  String str;
       private  double bal;

       String Br = "PUNJAB NATIONAL BANK ";

       public Account(int a, String b , double c)
       {
           accid=a;
           str=b;
           bal=c;

       }
       public void show()
       {
           System.out.println( "The account id is " +accid + "\n Name is "+str +"\n bal " +bal + "\n Branch is" +Br) ;

       }
}
