import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors
{
   public static void main(String[] args)
   {
      int userScore = 0;
      int computerScore = 0;
      System.out.println("Jeu pierre, papier, ciseaux.\nVous choisissez lequel?");
      boolean play = false;
      do
      {
         String userChoice;
         boolean good = false;
         do
         {
            Scanner scan = new Scanner(System.in);
            userChoice = scan.nextLine();
            userChoice = userChoice.toLowerCase();
            if (userChoice.equals("pierre") || userChoice.equals("ciseaux") || userChoice.equals("papier"))
            {
               good = true;
            }
            else good = false;
         }
         while (!good);
         System.out.println("You chose: " + userChoice);
            
         Random rand = new Random();
         int n = rand.nextInt(3);
         switch (userChoice)
         {
            case "pierre":
               switch (n)
               {
                  case 0:
                     System.out.println("Computer chose: pierre\n");
                     System.out.println("You tie");
                     break;
                  case 1:
                     System.out.println("Computer chose: papier\n");
                     System.out.println("You lose");
                     computerScore++;
                     break;
                  case 2:
                     System.out.println("Computer chose: ciseaux\n");
                     System.out.println("You win");
                     userScore++;
                     break;
               }
               break;
            case "papier":
               switch (n)
               {
                  case 0:
                     System.out.println("Computer chose: pierre\n");
                     System.out.println("You win");
                     userScore++;
                     break;
                  case 1:
                     System.out.println("Computer chose: papier\n");
                     System.out.println("You tie");
                     break;
                  case 2:
                     System.out.println("Computer chose: ciseaux\n");
                     System.out.println("You lose");
                     computerScore++;
                     break;
               }
               break;
            case "ciseaux":
               switch (n)
               {
                  case 0:
                     System.out.println("Computer chose: pierre\n");
                     System.out.println("You lose");
                     computerScore++;
                     break;
                  case 1:
                     System.out.println("Computer chose: papier\n");
                     System.out.println("You win");
                     userScore++;
                     break;
                  case 2:
                     System.out.println("Computer chose: ciseaux\n");
                     System.out.println("You tie");
                     break;
               }
               break;
         }
         System.out.println("\n\n\n\tScore\nYou: " + userScore + "\nComputer: " + computerScore + "\n");
         String playAgain;
         boolean good2;
         System.out.println("Do you want to play again? Enter \"yes\" or \"no\".");
         do
         {
            Scanner scan = new Scanner(System.in);
            playAgain = scan.nextLine();
            playAgain = playAgain.toLowerCase();
            if (playAgain.equals("yes") || playAgain.equals("no"))
            {
               good2 = true;
            }
            else good2 = false;
         }
         while (!good2);
         if (playAgain.equals("yes"))
         {
            play = true;
            System.out.println("What do you chose?");
         }
         else if (playAgain.equals("no"))
         {
            play = false;
         }
      }
      while(play);
   }
}