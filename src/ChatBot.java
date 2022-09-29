import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to ChatBot! What would you like to do?");
        String userInput = s.nextLine();

        if (userInput == "w") {
            System.out.println("It is going to be very sunny today.");
        } if (userInput == "t") {
            System.out.println("It is 1:00 pm.");
        }

    }
}
