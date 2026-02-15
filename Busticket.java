import java.util.*;
public class Busticket
{
    public static void main(String[] args) {
     LinkedHashMap<Integer,String> maps=new LinkedHashMap<>();
     Scanner sc=new Scanner(System.in);
     int choice;
     do
     {
        System.out.println("Enter your choice");
        System.out.println("1. Book Ticket");
        System.out.println("2. View Tickets");
        System.out.println("3. Cancel Ticket");
        System.out.println("4. EXIT");
        choice=sc.nextInt(); 
        switch(choice)
        {
            case 1:
                System.out.println("Enter the Ticket Id:");
                int TicketId=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Passenger Name");
                String name=sc.nextLine();
                maps.put(TicketId,name);
                System.out.println("Ticket Booked Successfully");
                break;
            case 2:
                if(maps.isEmpty())
                {
                    System.out.println(" No Ticket Booked Yet.....");
                }
                else
                {
                    System.out.println(" Booked Ticket History");
                    for(Map.Entry<Integer,String> leet:maps.entrySet())
                    {
                        System.out.println("Ticket No : "+leet.getKey()+"  Passenger Name : "+leet.getValue());
                    }
                }
                break;
            case 3:
                System.out.println(" ENter ticket id to cancel");
                int cancel=sc.nextInt();
                sc.nextLine();
                if(maps.remove(cancel)!=null)
                {
                    System.out.println("Ticket Cancelled Successfully");
                }
                else
                {
                    System.out.println("Ticket not found Yet!!!!!");
                }
                break;
            case 4:
                System.out.println("Thank you for using bus ticket system...");
                break;
            default:
                System.out.println("Invalid option!!!!!!");
        }    
    }while(choice!=4);
    sc.close();
    }
}