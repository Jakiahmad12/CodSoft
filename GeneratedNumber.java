//1. Generate a random number within a specified range, such as 1 to 100.
//
//2. Prompt the user to enter their guess for the generated number.
//
//3. Compare the user's guess with the generated number and provide feedback on whether the guess
//is correct, too high, or too low.
//
//4. Repeat steps 2 and 3 until the user guesses the correct number.
//
//You can incorporate additional details as follows:
//
//5. Limit the number of attempts the user has to guess the number.
//6. Add the option for multiple rounds, allowing the user to play again.
//7. Display the user's score, which can be based on the number of attempts taken or rounds won.
import java.util.*;
    public class GeneratedNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the guess for the generated number");
            int attempts = 0;
            int maxAttempts =3;
            int GeneratedNumber=sc.nextInt();
            while (true) {
                int num = sc.nextInt();
                attempts++;
                System.out.println("================Feedback=======================");
                if (num == GeneratedNumber) {
                    System.out.println("Congratulations! You guessed the correct number");
                } else if (num > GeneratedNumber) {
                    System.out.println("Sorry! the correct number was Too High:- ");
                } else if (num < GeneratedNumber) {
                    System.out.println("Sorry! the correct number was Too low:- ");
                } else {
                    System.out.println("invalid");
                }
                if (attempts == maxAttempts) {
                    System.out.println("Sorry! you have reached the maximum number");
                    break;
                }
            }
            System.out.println("============================");
            System.out.println(" The correct guess number is "+GeneratedNumber);
            System.out.println("Thank you for playing");
            sc.close();
        }
    }

