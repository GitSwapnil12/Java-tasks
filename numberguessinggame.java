import java.util.Random;
import java.util.Scanner;

class guess
{
    Random rn=new Random();
    Scanner sc=new Scanner(System.in);
    int number;
    int guessno;
    
    void guessnumber(int gn)
    {
        number=1 + (int)(99* Math.random());
        System.out.println("System has taken 2-digit random number ");
        System.out.println("Guess the number : ");
        gn=sc.nextInt();
        guessno++;
        if (number==gn) 
        {
            System.out.println("Congrats you have guessed the right number ");
            guessno++;
            
        }
        else if (number<=99 && number>=90)
        {
            System.out.println("Random number is between 90 to 99");
            while (!(number==gn)) 
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
                
                
            }
            System.out.println("Congrats you have guessed the right number in "+ guessno +" guesses");


        }
        else if (number<=90 && number>=80)
        {
            System.out.println("Random number is between 80 to 90");
            while (!(number==gn)) 
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
                
            }
            System.out.println("Congrats you have guessed the right number in "+ guessno +" guesses");


        }
        else if (number<=80 && number>=70)
        {
            System.out.println("Random number is between 70 to 80");
            while (!(number==gn)) 
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
                
            }
           System.out.println("Congrats you have guessed the right number in "+ guessno +" guesses");


        }
        else if (number<=70 && number>=60)
        {
            System.out.println("Random number is between 60 to 70");
            while (!(number==gn)) 
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
                
            }
            System.out.println("Congrats you have guessed the right number in "+ guessno +" guesses");


        }
        else if (number<=60 && number>=50)
        {
            System.out.println("Random number is between 50 to 60");
            while (!(number==gn)) 
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
                
            }
           System.out.println("Congrats you have guessed the right number in "+ guessno +" guesses");


        }
        else if (number<=50 && number>=40)
        {
            System.out.println("Random number is between 40 to 50");
            while (!(number==gn)) 
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
               
            }
            System.out.println("Congrats you have guessed the right number in "+ guessno +" guesses");


        }
        else if (number<=40 && number>=30)
        {
            System.out.println("Random number is between 30 to 40");
            while (!(number==gn))  
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
               
            }
           System.out.println("Congrats you have guessed the right number in "+ guessno +" guesses");


        }
        else if (number<=30 && number>=20)
        {
            System.out.println("Random number is between 20 to 30");
            while (!(number==gn))  
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
                
            }
            System.out.println("Congrats you have guessed the right number in "+ guessno +" guesses");


        }
        else if (number<=20 && number>=10)
        {
            System.out.println("Random number is between 10 to 20");
            while (!(number==gn)) 
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
                
            }
            System.out.println("Congrats you have guessed the right number in "+ guessno +" guesses");


        }
        else if (number<=10 && number>=0)
        {
            System.out.println("Random number is between 0 to 10");
            while (!(number==gn)) 
            {
                System.out.println("Guess the number");
                gn=sc.nextInt();
                guessno++;
                
            }
            System.out.println("Congrats you have guessed the right number in "+guessno +" guesses");


        }
        

    }


}



public class NumberGuessingGame {

    public static void main(String[] args) {

        guess g=new guess();
        int n=0;
        g.guessnumber(n);
      
    }
    
}
