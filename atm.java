import java.util.*;
//---------------ABSTRACTION------------------------
abstract class Account
{
    protected String holdername;
    protected double balance;
    Account(String holdername,double balance)
    {
        this.holdername=holdername;
        this.balance=balance;
    }
    public void deposit(double amount)
    {
         if(amount>0)
         {
            balance+=amount;
            System.out.println("Deposited Successfully!!!!!!!!");
         }
         else
         {
            System.out.println(" Invalid Deposit amount !!!!!!!!");
         }
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
          balance-=amount;
          System.out.println("Rs" + amount + " Withdrawn Successfully");
        }
        else
        {
            System.out.println("Insufficient balance or invalid amount!!!!!!!!!!!!");
        }
    }
    public void balance()
    {
        System.out.println("Available Balance :" + balance);
    }
    abstract void accountType();
}
//----------------INHERITANCE------------------
class Savingaccount extends Account
{

Savingaccount(String name, double balance)
{
    super(name, balance);
}
@Override
void accountType()
{ 
    System.out.println("Account Type : Savings Account ");
}
}
class Currentaccount extends Account
{
    Currentaccount(String name, double balance)
    {
        super(name, balance);
    }
    @Override
    void accountType()
    {
        System.out.println("Account Type : Cuurent Type");
    }
}
//---------Main class-------------------------------
public class atm 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the Account Holder Name :");
        String name=sc.next();
        System.out.println(" Enter Inintial balance  : ");
        double balance=sc.nextDouble();
        System.out.println(" Enter Account Type");
        System.out.println(" 1. Savings Account");
        System.out.println("2. Current Account");
        int choice =sc.nextInt();
        //-----------------UPCASTING-----------------
        Account account;
        if(choice==1)
        {
        account=new Savingaccount(name, balance);
        }
        else
        {
            account=new Currentaccount(name, balance);
        }
        int option;
        do
        {
          System.out.println("/n----------ATM MENU--------------");
          System.out.println(" 1. Check Balance");
          System.out.println("2. Deposit ");
          System.out.println("3. Withdraw");
          System.out.println("4. Account Type");
          System.out.println(" 5. Exit");
          System.out.println(" Choose an option ");
        option=sc.nextInt();
        switch(option)
        {
            case 1:
                account.balance();
                System.out.println("Balance :" + balance);
                break;
            case 2:
                System.out.println("Enter amount to deposit!!");
                account.deposit(sc.nextDouble());
                break;
            case 3:
                System.out.println("Enter amount to withdraw!!");
                account.withdraw(sc.nextDouble());
                break;
            case 4:
                account.accountType(); //--------POLYMORPHISM--------
                break;
            case 5:
                System.out.println("----------Thank you for using our ATM------------");
                break;
            default:
                System.out.println(" Invalid Option");
            }
        }   while(option != 5);
        sc.close();
    }
        
    
}
