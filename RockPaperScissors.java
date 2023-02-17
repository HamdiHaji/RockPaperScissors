import java.util.Scanner; 
public class RockPaperScissors {
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
    
        // See if the user wants to play. 
        String response = scan.nextLine();

        if (response.equals("yes") || response.equals("Yes")) {
            System.out.println("Great!");
            System.out.println("\nrock - paper - scissors, shoot!");
            String choice = scan.nextLine();

            String computerChoice = computerChoice(); 
        
            String result = result(choice, computerChoice);
            printResult(choice, computerChoice, result);

            } else {
                System.out.println("Darn, some other time...");
            }   
    
            scan.close();
        }
        
        public static String computerChoice() {
            double randomN = Math.random() * 3;
            int integar = (int)randomN; 

            switch (integar) {
                case 0: return "rock";
                case 1: return "paper";
                case 3: return "scissors"; 
                default: return " "; 
            }
        }
        // need to fix this
        public static String result(String yourChoice, String computerChoice) {
            String result = " ";
            if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
                result = "You win!";
            } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
                result = "You win!";
            } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
                result = "You win!";
            } else if (yourChoice.equals("scissors") && computerChoice.equals("rock"))  {
                result = "You lose!";
            } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
                result = "You lose!";
            } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
                result = "You lose!";
            } else if (yourChoice.equals(computerChoice)) {
                result = "It's a tie!";
            } else {
                System.out.println("Invalid choice.");
                System.exit(0);
            }
            return result;
        }
        
        public static void printResult(String yourChoice, String computerChoice, String result) {
            System.out.println("\nYou chose: " + yourChoice); 
            System.out.println("The computer chose: " + computerChoice); // 
            System.out.println(result); 
        }
    }
