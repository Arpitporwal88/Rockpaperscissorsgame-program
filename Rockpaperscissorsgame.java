import java.util.*;
public class Rockpaperscissorsgame{
 int userChoice, computerChoice, rock, paper, scissors;
      Scanner sc= new Scanner (System.in);
      
      Random random = new Random();  
     public  Rockpaperscissorsgame(){
       rock = 0;
      paper = 1;
      scissors = 2;
      System.out.println("Rock  Paper  Scissors Game");
      System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
   
             userChoice = sc.nextInt();
              while (userChoice > 2) {
            System.out.println("give number between 0 and 2");
            userChoice = sc.nextInt();
        }
       if (userChoice == rock)
       {
         System.out.println("User chose ROCK");
       }
      else
      {
        if(userChoice== paper)
        {
          System.out.println("User chose PAPER");
        }
        else
        {
          System.out.println("User chose SCISSORS");
        }
          }
      computerChoice = random.nextInt(3);
       if(computerChoice == rock)
      {
        System.out.println("Computer chose ROCK");
      }
      else
      {
        if(computerChoice == paper)
        {
          System.out.println("Computer chose PAPER");
        }
        else
        {
          System.out.println("Computer chose SCISSORS");
        }
      }
      while (userChoice == computerChoice) {
            System.out.println("Try again");
            userChoice = sc.nextInt();
                          while (userChoice > 2) {
                            System.out.println("give number between 0 and 2");
                            userChoice = sc	.nextInt();
                            }
            computerChoice = random.nextInt(3);
                     
                        if (userChoice == rock)
                            {
                                System.out.println("User chose ROCK");
                            }
                        else
                        {
                            if(userChoice== paper)
                            {
                                System.out.println("User chose PAPER");
                            }
                            else
                            {
                                System.out.println("User chose SCISSORS");
                            }
	       }      
                  
                        if(computerChoice == rock)
                            {
                                System.out.println("Computer chose ROCK");
                            }
                        else
                            {
                                if(computerChoice == paper)
                                {
                                    System.out.println("Computer chose PAPER");
                                }
                                else
                                {
                                    System.out.println("Computer chose SCISSORS");
                                }
                            }
                        } 
      
      if (computerChoice==rock)
        {
            if (userChoice==paper)
            {  
                System.out.println("User win....");
            }
            else 
            {
                System.out.println("Computer Win.....");
            }
        }
      else if (computerChoice==paper)
      {
        if (userChoice==rock)
            {
                System.out.println("Computer win.....");
            }
        else
            {
                System.out.println("User Win......");
            }
      }
      else if (userChoice==rock)
      {
        System.out.println("User Win......");
      }
      else
      {
          System.out.println("Computer Win.....");
      } 
    }
public static void main(String[] args) {
       Rockpaperscissorsgame  rpsg=new Rockpaperscissorsgame();
      }
}