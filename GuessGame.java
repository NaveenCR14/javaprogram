import java.util.Scanner;
import java.util.Random;
public class GuessGame 
{
 public static void main(String[] args) 
{
 Scanner scanner = new Scanner(System.in);
 Random random = new Random();
 int min = 1; 
 int max = 100; 
 int totalAttempts = 5; 
 int Rounds = 3; 
 int Score = 0; 
 System.out.println("Welcome to the Number Guessing Game!");
 System.out.println("You have " + totalAttempts + " attempts per round.");
 System.out.println("Let's begin!");
 for (int round = 1; round <= Rounds; round++) 
{
 int Number = random.nextInt(max - min + 1) + min;
 int attempts = 0; 
 System.out.println("\nRound " + round + ":");
 System.out.println("Guess the number between " + min + " and " + max);
 while (attempts < totalAttempts) 
{
 System.out.print("Enter your guess: ");
 int Guess = scanner.nextInt();
 attempts++;
 if (Guess == Number) 
{
 System.out.println("Congratulations! You guessed it right.");
 Score += totalAttempts - attempts + 1; 
 break;
}
else if (Guess < Number) 
{
System.out.println("Too low! Try again.");
} 
else 
{                    
System.out.println("Too high! Try again.");
}            
}
if (attempts == totalAttempts) 
{
System.out.println("Out of attempts. The correct number was " + Number);
}
}
System.out.println("\nGame over!");
System.out.println("Your total score: " + Score);
scanner.close();
}
}
