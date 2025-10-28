import java .util.*;
public class Collection
{
    public static void main(String[] args)
    {
        ArrayList<String> students=new ArrayList<>();
        students.add("pooja");
        students.add("vasuki");
       students.add("Eniyan");
       students.add("gopika");
        students.add("Sivasakthi");
        students.add("pooja");
        System.out.println("Students list: "+list);
        //set : Removes Duplicate
        Hashset<String> uniqueStudents=new Hashset<>(students);
        System.out.println("Unique students"+uniqueStudents);
        //MAp :key-value pair..
        HashMap<String,Integer> marks=new Hashmap<>();
        marks.put("pooja",99);
        marks.put("vasuki",89);
        marks.put("Eniyan",45);
        marks.put("gopika",100);
        marks.put("Sivasakthi",56);
        System.out.println("Marks map"+marks);
        for(String name:marks.keyset())
        {
            System.out.println(name+"Scored"+marks.get(name));
        }
    
}