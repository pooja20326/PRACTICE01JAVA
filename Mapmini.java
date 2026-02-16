import java.util.*;
public class Mapmini
{
  public static void main(String[] args) 
  {
       TreeMap<Integer,String> maps=new TreeMap<>();
       Scanner sc=new Scanner(System.in);
       int choice;
       do
       {
        System.out.println("Enter your choice");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. View Student");
        System.out.println("4. Exit");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the mark of the student");
                int mark=sc.nextInt();
                System.out.println("Enter student Name");
                sc.nextLine();
                String name=sc.nextLine();
                maps.put(mark,name);
                break;
            case 2:
                 System.out.println("Enter student mark to delete");
                int mrk=sc.nextInt();
                if(maps.remove(mrk)!=null)
                {
                    System.out.println(" the  successfully");
                }
                else
                {
                    System.out.println("The student not found");
                }
                break;
            case 3:
                if(maps.isEmpty())
                {
                    System.out.println("There is no Students");
                }
                else
                {
                    for(Map.Entry<Integer,String> entry:maps.entrySet())
                    {
                        System.out.println(" Student mark :  "+entry.getKey()+"    name of the student :  "+entry.getValue() );
                    }
                }
                break;
            case 4:
                System.out.println("Thanks for using our system...!!!");
                break;
            default:
                System.out.println("Iinvalid option");
                break;
        }
       }while(choice!=4);

  }
}