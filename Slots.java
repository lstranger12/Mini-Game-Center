import javax.swing.SpinnerDateModel;
import java.util.Scanner;

public class Slots {
    public static void startSlots(){
        System.out.println("\nWelcome to slots!");
        boolean slots = true;

        int totalSpins = 0;
        int totalLosses = 0;
        int totalSmallWins = 0;
        int totalJackpots = 0;

        int slotValue = 0;

        while(slotValue < 2){
         Scanner slotValueScanner = new Scanner(System.in);
         System.out.println("What value would you like to play slots by?");
         slotValue = slotValueScanner.nextInt();
         if(slotValue < 2){
            System.out.println("Please enter a value greater than 1!");
         }
        }

        while(slots == true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - Spin");
            System.out.println("2 - |Exit|");
            System.out.println("3 - Stats");
            System.out.println("-");
            int slotsInput = scanner.nextInt();
            if (slotsInput == 1)
            {
                int firstRoll = (int) (Math.random() * slotValue) + 1;
                int secondRoll = (int) (Math.random() * slotValue) + 1;
                int thirdRoll = (int) (Math.random() * slotValue) + 1;
                if(firstRoll == secondRoll || secondRoll == thirdRoll || firstRoll == thirdRoll){
                    if(firstRoll == secondRoll && secondRoll == thirdRoll){
                        System.out.println("\n!!!<[+]>JACKPOT<[+]>!!!");
                        totalSpins++;
                        totalJackpots++;
                    }else{
                        System.out.println("\n-Small Win!-");
                        totalSpins++;
                        totalSmallWins++;
                    }
                }else{
                    System.out.println("\n -- ");
                    totalSpins++;
                    totalLosses++;
                }
                System.out.print(firstRoll + " ");
                System.out.print(secondRoll + " ");
                System.out.print(thirdRoll + "\n\n");
            }
            else if (slotsInput == 2)
            {
                System.out.println("Goodbye!");
                slots = false;
                Menu.userMenuLoop();
            }
            else if (slotsInput==3)
            {
                System.out.println("\nTotal Spins: " + totalSpins);
                System.out.println("Total Losses: " + totalLosses);
                System.out.println("Total Small Wins: " + totalSmallWins);
                System.out.println("Total Jackpots: " + totalJackpots + "\n");
            }
        }
    }
}
