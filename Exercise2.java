import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr ={"Rock", "Paper", "Scissors"};
        System.out.println("Enter your choice: Rock, Paper or Scissors");
        String userChoice = sc.nextLine();
        int random = (int)(Math.random()*3);
        String computerChoice = arr[random];
        System.out.println("Computer choice: " + computerChoice);
        if(userChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
        } else if(userChoice.equals("Rock")){
            if(computerChoice.equals("Paper")){
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else if(userChoice.equals("Paper")){
            if(computerChoice.equals("Scissors")){
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else if(userChoice.equals("Scissors")){
            if(computerChoice.equals("Rock")){
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
