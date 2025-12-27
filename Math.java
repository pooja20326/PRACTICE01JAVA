class Shape
{
    void Draw()
    {
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape
{
    void Draw()
    {
        super.Draw();
        System.out.println("Drawing Circle");
    }
}
public class Math {
    public static void main(String[] args) 
    {
        Shape d=new Circle();
        
        d.Draw();   
    }

   
}