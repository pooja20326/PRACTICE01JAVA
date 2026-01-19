import java.util.*;
class task
{
    int id;
    String name;
    task(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println(" Task ID : "+id + " Task Name : "+ name);
    }
}
public class TOdolist 
{
  public static void main(String[] args) 
  {
    LinkedList<task> tk=new LinkedList<>();
    Scanner sc=new Scanner(System.in);
    int choice;
    do
    {
        System.out.println("\n-------TASK MANAGER----------");
        System.out.println("1. Add Task");
        System.out.println("2. Add Urgent Task (First)");
        System.out.println("3. View Task ");
        System.out.println("4. Complete Task");
        System.out.println("5. EXIT");
        System.out.println("Enter the no to do the task manager");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter Task Id");
                int id=sc.nextInt();
                System.out.println("Enter Task Name");
                sc.nextLine();
                String name=sc.nextLine();
                tk.add(new task(id,name));
                System.out.println("Task Added Successfully");
                break;
            case 2:
                System.out.println("Enter Task Id");
                int uid=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Task Name");
                String uname=sc.nextLine();
                tk.addFirst(new task(uid,uname));
                System.out.println("Task added at first Successfully");
                break;
            case 3:
                if(tk.isEmpty())
                {
                    System.out.println("Task Not Available");
                }
                else
                {
                    for(task t: tk)
                    {
                        t.display();
                    }
                }
                break;
            case 4:
                System.out.println("Enter Task id to Complete");
                int rid=sc.nextInt();
                Iterator<task> itr=tk.iterator();
                boolean removed =false;
                while(itr.hasNext())
                {
                    task t=itr.next();
                
                if(t.id==rid)
                {
                    itr.remove();
                
                System.out.println("Task completed and removed from the list");
                removed=true;
                break;
                }
            }
          {
                System.out.println(" Task not Found or Already completed & removed from the list");
            }
            break;
        case 5:
            System.out.println(" Great Job Today");
            break;
        default:
            System.out.println("Invalid Choice");
        }
    }while(choice!=5);

  }
    
}