//------------------ABSTRACTION-----------------
abstract class person
{
    protected String name;
    protected int age;
abstract void displayDetails();
}
//-----INHERITANCE----------ENCAPSULATION-------------
class student extends person
{
    private int marks;
    public void setdetails(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setmarks(int marks)
    {
        if(marks>=0&&marks<=100)
        {
            this.marks=marks;
        }
        else
        {
            System.out.println("Invalid marks");
        }       
    }
    public int getmarks()
    {
        return marks;
    }
    String Calculate_Grade()
{
    if(marks>=90)
    {
        return "A+";
    }
    else if(marks>=75)
    {
        return "A";
    }
    else if(marks>=50)
    {
        return "B";
    }
    else
    {
        return "FAIL";
    }

}
//--------------------POLYMORPHISM---------------------
      @Override
         void displayDetails()
              {
                System.out.println("Name :  "+ name);
                System.out.println("Age  :  "+ age);
                System.out.println("Marks :  "+ marks);
                System.out.println("Grade  :   "+ Calculate_Grade());
              }
}
//-------------MAIN CLASS-----------------------
class OOPS
{
    public static void main(String[] args) 
    {
        //-----POLYMORPHISM-------
        person p=new student();  //--PARENT REFERENCE--CHILD OBJECT-----
        //---DOWNCASTING TO CHILD METHODS
        student s=(student) p;
        s.setdetails("pooja",22);
        s.setmarks(85);
        //-----------RUNTIME POLYMORPHISM-----------------------
        p.displayDetails();
        System.out.println("\n Accessing Child object directly");
        student s2=new student();
        s2.setdetails("Anu", 23);
        s2.setmarks(92);
        s2.displayDetails();
    }
}