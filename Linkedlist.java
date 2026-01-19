import java.util.*;
public class Linkedlist
{
    public static void main(String args[])
{
    LinkedList<String> list=new LinkedList<>(); 
    //---ADDING ELEMENT-----
    list.add("pooja");
    list.add("vasuki");
    list.add("kaviya");
    list.add("Poornima");
    list.add("jeniliya");
    //------Display all-----------
    System.out.println(" List  : "+ list);
    //-------ADD AT FIRST &  LAST------
    list.addFirst("Amma");
    list.addLast("Thambi");
    //-------AFTER ADDING FIRST &LAST ELEMENT-------
    System.out.println(" List : "+ list);
    //----ITERATE-------
    for(String s :list)
    {
        System.out.println(s);
    }

}
}