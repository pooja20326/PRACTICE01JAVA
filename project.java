import java.util.*;
import java.io.*;
class Student
{
    int id;
    String name;
    Student(int id , String name)
    {
        this.id=id;
        this.name=name;
    }
@Override
public boolean equals(Object obj)
{
    if(this==obj)
    {
        return true;
    }
    if(obj==null||getClass()!=obj.getClass())
        return false;
    Student other=(Student) obj;
    return this.id==other.id;
}
@Override
public int hashCode()
{
    return id;
}
@Override
public String toString()
{
    return id + " " + name; 
}
}
public class project 
{
    public static void main(String[] args)
    {
        Student s1=new Student(1, "pooja");
        Student s2=new Student(2,"Ravi");
        System.out.println("Comparing object using equals()");
        System.out.println(s1.equals(s2));
        System.out.println("\n Hash codes : ");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("\n Testing in Hashset");
        Set<Student> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        for(Student s:set)
        {
            System.out.println(s);
        }
    }   
}