import java.util.Scanner;
public class Task3_ATM_Interface
{
    static int balance = 500;
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\n*** Welcome to the ATM ***");
        do
        {
            System.out.println("\n1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit \n");
            System.out.print("Please select an option to proceed transcation:");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                checkBalance();
                break;
                case 2:
                withdraw(sc);
                break;
                case 3:
                deposit(sc);
                break;
                case 4:
                System.out.println("Thank you for using the ATM");
                break;
                default:
                System.out.println("Invalid choice");
                break;
            }

        } while (choice != 4);
    }
    private static void checkBalance() 
    {
        System.out.println("\nYour current balance is: " + balance);
    }
    private static void withdraw(Scanner input) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter amount to withdraw:");
        int amount = sc.nextInt();
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } 
        
        else 
        {
            System.out.println("Insufficient balance");
        }
        System.out.println("Your current balance is: " + balance);
       
    }
    private static void deposit(Scanner input)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter amount to deposit:");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("\nDeposit successful");
        System.out.println("Your current balance is: " + balance);
    }
}