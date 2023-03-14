package Abstract;
//
//Abstract  methods are those methods which method do not have body ..iska syntx accesmodifier non acceess modifier
//return type method name (argumetns );
//
//hum abstract method islie bnata hai kukki kabhi kbhar in parent class we do not have proper information
//so we have to keep the method blank , java says u can make that method abstract .
//
//we have those methods also which cant be abstract
//1 . is Static .
//2. Private method
//3. Final
//4. Constructor
public class Fruit {

    final  private double PI;
     public Fruit ()
    {
        PI=3.14;
    }
}

class Mango extends Fruit
{
    public void taste()
    {
        System.out.println("osm taste");
    }
}

class UseMango
{
    public static void main(String[] args) {

        Fruit f = new Mango();
//        f.taste();
    }
}