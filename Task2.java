import java.util.Scanner;
public class Task2
{ 
    public static void GuessingNumGame() 
    {    
         Scanner sc=new Scanner(System.in);
         int number =1+(int)(100*Math.random());
         int n=6;
         int i,guess;
         System.out.println("*** You have to choose number "+" between 1 to 100 ***");
         System.out.println("Guess the number"+" within 6 trials");
        for(i=0; i<n;i++)
        {
            System.out.print("Guess the number: ");
            guess=sc.nextInt();
            if (number ==guess)      
            {
                System.out.println("Congratulations!"+"You guessed the number.");
                break;
            }
            else if (number > guess && i !=n-1 )
            {
                System.out.println("The number is "+"greater than : " +guess);
            }	    
            else  
                System.out.println("The number is "+"smaller than : " +guess);	    
        }
        if (i==n)
        {
            System.out.println("You have completed "+" n trials.");
            System.out.println("The number was : " +number);
        }
    }    
    public static void main(String args[])
    {
        GuessingNumGame();
    }
}