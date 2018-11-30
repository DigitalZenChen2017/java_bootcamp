import java.util.Scanner;

public class GuessNumberApp {
    
    public static void main(String[] args) {
        // Initialize number limit (ex: Between 1 and LIMIT)
    	final int LIMIT = 10;
        
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + LIMIT);
        System.out.println();

        // get a random number between 1 and the limit
        double d = Math.random() * LIMIT; // d is >= 0.0 and < limit
        int number = (int) d;             // convert double to int
        number++;                         // int is >= 1 and <= limit
        
        @SuppressWarnings("resource")
        int count = 0;
        int guess = 0;
        while (guess != number) {
        	// Prompt User Input - Guess Number
        	Scanner sc = new Scanner(System.in);            
        	System.out.println(" ");
        	System.out.print("Your guess: ");
        	guess = sc.nextInt();
        	        	
        	if (guess < 1 || guess > LIMIT) {
        		System.out.println(" ");
        		System.out.println("Invalid guess. Try again.");
        		count--;        		
        		} else if (guess < number) {
        			System.out.println(" ");
        			System.out.println("Too low.");
        		} else if (guess > number) {
        			System.out.println(" ");
        			System.out.println("Too high.");
        		}
        	
        	count++;
        	}               	
        	System.out.println(" ");
        	System.out.println("You guessed it in " + 
					count + " tries.\n");
        	System.out.println(" ");
        	System.out.println("Bye!");
        }        		
        
    }
    

      
//        while (true) {
//            System.out.print("Your guess: ");
//            int guess = sc.nextInt();
//            
//            if (guess < 1 || guess > LIMIT) {
//                System.out.println("Invalid guess. Try again.");
//                continue;
//            }
//            
//            if (guess < number) {
//                System.out.println("Too low.");
//            } else if (guess > number) {
//                System.out.println("Too high.");
//            } else {
//                System.out.println("You guessed it in " + 
//                                   count + " tries.\n");
//                break;
//            }            
//            count++;
////        }
////        System.out.println("Bye!");
//    }   
//}