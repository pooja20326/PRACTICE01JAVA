import java.util.*;
public class Treemapp 
{
public static void main(String[] args)
{
    TreeMap<Integer,String> tre=new TreeMap<>();
    tre.put(101,"A");
    tre.put(102,"B");
    tre.put(103,"C");
    tre.put(104,"D");
    tre.put(105,"E");
    tre.put(106,"F");
    System.out.println("Firstkey :  "+tre.firstKey());
    System.out.println("Lastkey  :  "+ tre.lastKey());
    System.out.println("higher than :  "+tre.higherKey(104));
    System.out.println(" Lower Key : "+ tre.lowerKey(103));        
}
}