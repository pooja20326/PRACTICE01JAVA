import java.util.*;
public class collections_list1 
{
    public static void main(String[] args)
    {
      ArrayList<String> name=new ArrayList<>();  
      //-------ADDING ELEMENTS TO LIST---------
      name.add("pooja");
      name.add("Eniyan");
      name.add("Nithish");
      name.add("Vasuki");
      System.out.println(name);
      //-------------ACCESSING LIST ELEMENT-----------
      System.out.println(name.get(0));
      System.out.println(name.get(2));
      //---------CHANGE ELEMENT-----------
      name.set(2,"kaviya");
      System.out.println(name);
      //----------REMOVE ELEMENT----------
      name.remove(3);
      System.out.println(name);
      //-----SIZE OF LIST--------
      System.out.println(name.size());

    } 
}