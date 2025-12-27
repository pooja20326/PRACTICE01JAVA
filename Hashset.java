import java.util.*;
public class Hashset
{
    public static void main(String[] args)
    {
        Hashset<integer> set=new Hashset<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        System.out.println(set);
        System.out.println(set.contains(20));
    }
} 