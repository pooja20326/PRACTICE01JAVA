import java.util.*
public class Hashmap
{
    public static void main(String[] args)
    {
        Hashmap<String,Integer> marks=new HashMap<>();
        marks.put("pooja",90);
        marks.put("vasuki",98);
        marks.put("kaviya",99);
        System.out.println(marks.get("pooja"));
        for(String key: marks.keyset())
        {
            System.out.println(key+":"+marks.get(key));
        }
    }
}