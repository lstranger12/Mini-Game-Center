import java.util.Scanner;

public class Menu {
    public static void main(String[] args)
    {

        System.out.println("\nWelcome to the minigame center!");
        System.out.println("The options for games to play are:");
        System.out.println("-");
        System.out.println("1 - Song Guesser");
        System.out.println("2 - Slots");
        System.out.println("3 - |Exit|");
        System.out.println("-");
        Scanner scanner = new Scanner(System.in);
        int userSelection = scanner.nextInt();
        if (userSelection == 1){

        } else if (userSelection == 2){

        } else if (userSelection == 3){
            System.out.println("Exiting...");
            System.out.println("Goodbye");
        } else {

        }
    }
}