
// -----------Generics helps create reusable classes-----------
/* we can use Different objects with different types but we cant use different types with same object */

import java.util.*;
import java.io.*;
class box<T>
{
    T value;
    void setvalue(T value)
    {
        this.value=value;
    }
    T getvalue()
    {
        return value;
    }
}
public class generics1
{
    public static void main(String[] args)
    {
        box<String> box1=new box<>();
        box1.setvalue("hello pooja");
        System.out.println(box1.getvalue());
    }
}