package Collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

class ArrayListDemo
{


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        ArrayList<String> obj = new ArrayList<>();


        for(int i=0; i<5; i++)
        {
            System.out.println("Enter Country Name " +i);
            String  s = kb.next();
            obj.add(s);
        }

//        obj.add("India");
//        obj.add("USA");
//        obj.add("China");
//        obj.add("Britain");
//        obj.add("Germany");

        System.out.println("Enter the Country Name YOu want to DELETE :---> ");
        String c = kb.next();
        int search = obj.indexOf(c);

        obj.remove(c);

        if(search==-1)
        {
            System.out.println("Element is not found");
        }

        else {
            for (int i = 0; i < obj.size(); i++) {
                System.out.println("The MOdified list is " + obj.get(i));

            }

        }

//        if(pos!=-1)
//        {
//
//            System.out.println("The Postin is : --------> " +pos+1);
//
//        }
////
//        else {
//
//            System.out.println("Country Not in the list ");
//        }









    }



}