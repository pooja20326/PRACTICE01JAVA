import java.util.*;
import java.io.*;
class box<B> 
{
    B value;
    void setvalue(B value)
    {
        this.value=value;
    }
    B getvalue()
    {
        return value;
    }
}
public class generics2
{
    public static void main(String[] args)
    {
        box<String>  boxx=new box<>();
        boxx.setvalue("pooja");
        box<Integer> box1=new box<>();
        box1.setvalue(100);
        System.out.println(boxx.getvalue());
        System.out.println(box1.getvalue());
    }
}