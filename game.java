import java.util.Scanner;
import java.util.Random;
public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("if 1 means rock");
    System.out.println("if 2 means scisors");
    System.out.println("if 3 means paper");
    System.out.println("your turn!");

    int myChoice = scanner.nextInt();
    int compChoice = random.nextInt(3) +1;

    System.out.println(compChoice);
    if (compChoice==myChoice){
        System.out.println("Draw!");
    } else if (compChoice ==1 && myChoice ==2) {
        System.out.println("Computer won");
    
    } else if (compChoice ==2 && myChoice ==1) {
        System.out.println("You won");

    } else if (compChoice ==2 && myChoice ==3) {
        System.out.println("Computer won");

    } else if (compChoice ==3 && myChoice ==2) {
        System.out.println("You won");

    } else if (compChoice ==3 && myChoice ==1) {
        System.out.println("Computer won");

    } else  {
        System.out.println("Computer won");
    }

    }

}




