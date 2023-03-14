package HashMapDemo;

import java.util.*;

public class Prac1 {

    public static void main(String[] args) {

        HashMap<String, Long > teamSca = new HashMap<>();

        teamSca.put("Ravi",9821162185L);
        teamSca.put("Shivraj",9625575351L);
        teamSca.put("Rana",8800483173L);
        teamSca.put("Arshlan",9529452554L);

        System.out.println(teamSca.get("Ravi"));

        System.out.println(teamSca.remove("ravi"));

        Collection <Long> c = teamSca.values();

        Iterator<Long> it = c.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());

        }

//        Set< Map.Entry<String,Long>> members = teamSca.entrySet();
    
//        Set<Map.Entry<String,Long>> members = teamSca.entrySet();
//
//        Iterator<Map.Entry<String, Long>> it = members.iterator();
//
//         while (it.hasNext())
//         {
//              Map.Entry<String , Long> e =     it.next();
//             System.out.println("name" +e.getKey() + "Number " +e.getValue());
//         }




    }
}
