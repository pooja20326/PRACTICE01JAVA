import java.util.*;
class Student
{
    int id;
    String name;
    int mark;
    Student(int id, String name, int mark)
    {
        this.id=id;
        this.name=name;
        this.mark=mark;

    }
    void display()
    {
        System.out.println(" ID : "+ id + " NAME : " + name + " MARK : " + mark);
    }
}
public class Student_Management 
{
public static void main(String[] args) 
{
    ArrayList<Student> students=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int choice;
    do
    {
        System.out.println(" \n STUDENT MANAGEMENT  ");
        System.out.println(" 1. Add Student ");
        System.out.println(" 2. View All Student");
        System.out.println(" 3. Srearch Student by id");
        System.out.println(" 4. Remove Student");
        System.out.println(" 5. Exit");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println(" Enter id");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println(" Enter Student name");
                String name=sc.nextLine();
                System.out.println(" Enter Marks");
                int mark=sc.nextInt();
                students.add(new Student(id,name,mark));
                System.out.println(" s4tudent Added Successfully!!!!!!!!1");
                break;
            case 2:
                if(students.isEmpty())
                {
                    System.out.println(" No Students found");
                }
                else
                {
                    for(Student s:students)
                    {
                        s.display();
                    }
                }
                break;
            case 3:
                System.out.println(" Enter ID to Search");
                int searchid=sc.nextInt();
                boolean found=false;
                for(Student s:students)
                {
                    if(s.id==searchid)
                    {
                    s.display();
                    found=true;
                    break;
                    }
                }
            if(!found)
            {
                System.out.println(" Student not Found");
            }
            break;
        case 4:
            System.out.println(" Enter Student ID to remove from the list");
            int removeid=sc.nextInt();
            boolean removed=false;
            Iterator<Student> iterate=new Iterator<>();
            while(iterate.hasNext())
            {
                Student s=itr.next();
                if(s.id==removedid)
                {
                    itr.remove();
                   removed=true;
                   System.out.println("Student removed from the list Successfully");
                    break;
                }
            } 
            if(!removed)
            {
                System.out.println(" Student not Found!!!!!!!!");
            }
            break;

        case 5:
            System.out.println(" Thank you");
            break;
        default:
            System.out.println("Invalid Choice");
        }
    }while(choice!=5);
}
}
