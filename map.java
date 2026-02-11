import java.util.*;
public class map 
{
public static void main(String[] args) 
{
    HashMap<Integer, String> maps=new HashMap<>();
    maps.put(1,"pooja");
    maps.put(2,"eniyan");
    maps.put(3,"Vasuki");
    maps.put(4,"Gopika");
    maps.put(5,"Dhasarathi");
    maps.put(6,"Nandhini");
    maps.put(7,"Samu");
    System.out.println(maps.get(4));
    System.out.println(maps.remove(6));
    System.out.println(maps.containsKey(5));
    System.out.println(maps.containsValue("pooja"));
    System.out.println(maps.size());
    for(Map.Entry<Integer, String> entry:maps.entrySet())
    {
        System.out.println(entry.getKey()+ "-->" + entry.getValue());
    }

}
}
