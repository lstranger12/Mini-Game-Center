import java.util.Scanner;

public class Menu {
    public static void main(String[] args)
    {
        //
        System.out.println("\nWelcome to the minigame center!");
        System.out.println("The options for games to play are:");
        userMenuLoop();
        //
    }
    //
    //
    //
    public static void userMenuLoop(){
        //
        Scanner scanner = new Scanner(System.in);
        int userSelection = 0;
        //
        while(userSelection < 1 || userSelection > 3)
        {
            //
            System.out.println(userSelection);
            System.out.println("-");
            System.out.println("1 - Slots");
            System.out.println("2 - Song Guesser");
            System.out.println("3 - |Exit|");
            System.out.println("-");
            //
            userSelection = scanner.nextInt();
            //
            if (userSelection == 1){
                Slots.startSlots();
            } else if (userSelection == 2){
                SongGuesser.startSongGuesser();
            } else if (userSelection == 3){
                System.out.println("Exiting...");
                System.out.println("Goodbye");
            } else {
                System.out.println("Not a valid input.");
            }
            //
        }
    }

    public static void resetUserMenu(){
        userMenuLoop();
    }
}