import java.util.*;

public class Linkedhashmap
{
    public static void main(String[] args)
    {
      LinkedHashMap<Integer,String> lets=new LinkedHashMap<>();
      lets.put(1,"pooja");
      lets.put(2,"eniyan");
      lets.put(3,"nandhini");
      lets.put(4,"Chandra");
      lets.put(5,"vasuki");
      lets.put(6,"Gopika Sivasakthi");
      lets.put(7,"Dhasarathi");
      lets.put(8,"Neerav rithvik");
      System.out.println("Linked Hash map Output");
      for(Map.Entry<Integer,String> y: lets.entrySet())
      {
        System.out.println("KEY : " + y.getKey()+"   Value : "+ y.getValue());
      }
    }
}