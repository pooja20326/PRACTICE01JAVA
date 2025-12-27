class Student
{
    private String name;
    private int marks;
    void setmarks(int m)
    {
        if(m>0)
        {
            marks=m;
        }
    }
    int getmarks()
    {
        {
            return marks;
        }
    }
    void setname(String n)
    {
        name=n;
    }
    String getname()
    {
        return name;
    }


    public static void main(String[] args)
    {
        Student s=new Student();
        s.setname("Eni");
        System.out.println(s.getname());
        s.setmarks(50);
       System.out.println(s.getmarks()); 
    }
}