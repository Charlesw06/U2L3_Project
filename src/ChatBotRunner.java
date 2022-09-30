import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot();

        Scanner input = new Scanner(System.in);
        chatBot.greeting();
        String userInput = input.nextLine();

        if (userInput.equals("w")) {
            chatBot.weather();
        } else if (userInput.equals("c")) {
            chatBot.distanceInfo();
        } else if (userInput.equals("num")) {
            Scanner userNum = new Scanner(System.in);
            System.out.println("What is your favorite number?");
            int favNum = userNum.nextInt();
            chatBot.favoriteNumber(favNum);
        } else {
            System.out.println("Please try again. Do you need some help?");
            chatBot.help();
        }

        System.out.println();
        chatBot.goodbye();
    }
}
