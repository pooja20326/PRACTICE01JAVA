import java.util.Scanner;
//----------------ABSTRACTION----------------
abstract class BankAccount
{
    protected string accountholder;
    protected double balance;
    BankAccount(String accountholder,double balance)
    {
        this.accountholder=accountholder;
        this.balance = balance;
    }
    //----Encapsulation :     controlled access
    public void deposit(double amount)
    {
        if(amount >0)
        {
            balance+=amount;
            System.out.println(" Amount deposited  : RS" + amount);
        }
        else
        {
           System.out.println(" Invalid deposit amount");
        }
    }
    public void withdraw(double amount)
    {
        if(amount>0&&amount<=balance)
        {
            balance-=amount;
            System.out.println(" Amount withdraw :  RS" +amount);
        }
        else
        {
          System.out.println(" Invlaid or Insufficient balance");
        }
    }
  
    void displaybalance()
    {
        System.out.println("Account Holder :"+ accountholder);
        System.out.println("Balance : RS  " + balance);
    } 
      abstract void calculateInterest(); 
}
//-----------INHERITENCE---------------
class SavingsAccount extends BankAccount
{
    SavingsAccount(String name , double balance)
    {
       Super(name,balance); 
    }
    @override
    void calculateInterest()
    {
        double interest=balance+0.04;
        balance+=interest;
        System.out.println(" Savings Account INterest Added  RS "+ interest);
    }
}
//-----------INHERITENCE---------------
class Currentaccount extends BankAccount
{
    Currentaccount(String name, double balance)
    {
        super(name, balance);
    }
    @override
    void calculateInterest()
    {
        System.out.println("NO interest for Current Account");
    }
}
//--------------------MAIN CLASS-----------------
public class Bank 
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println(" Enter ccount Holder Name");
    String name=sc.nextLine();
    System.out.println("Enter Initial balnce");
    double bl=sc.nextDouble();
    Sytem.out.println("Choose Account type");
    System.out.println(" 1. Savings Account");
    Syste.out.println("2. Current Accpunt");
    int choice=sc.nextInt();
    BankAccount=account;
    if(choice==1)
    {
        account=new SavingsAccount(name,bal);
    }
    else
    {
        account=new Currentaccount(name,bal);
    }
    int option;
    do
    {
         System.out.println("\n MENU-------");
         System.out.println("1. Deposit");
         System.out.println(" 2. Withdraw");
         Sytem.out.println(" 3. Calculate Intereset");
         system.out.println(" CHOOSE OPTION");
         option=sc.nextInt();
         switch(option)
         {
         
            case 1:
                System.out.println(" Enter amount to deposit");
                account.deposit(sc.nextDouble());
                break;
         
         case 2:
            
                System.out.println("Enter amount to Withdraw");
                account.withdraw(sc.nextDouble());
                break;
            
            case 3:
                
                    account.calculateInterest(); // POLYMORPHISM-------
                    break;
                
                case 4:
                    
                        account.balance();
                        break;
                    
                    default :
                    
                        System.out.println("Invlid Option");
         }
                    
    }while(option!=5);
    
    sc.close();
}  
}