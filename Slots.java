import javax.swing.SpinnerDateModel;
import java.util.Scanner;

public class Slots {
    public static void startSlots(){
        System.out.println("Welcome to slots!");
        boolean slots = true;

        while(slots == true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Spin");
            System.out.println("2. Exit");
            int slotsInput = scanner.nextInt();
            if (slotsInput == 1)
            {
                int firstRoll = (int) (Math.random() * 7) + 1;
                int secondRoll = (int) (Math.random() * 7) + 1;
                int thirdRoll = (int) (Math.random() * 7) + 1;
                System.out.println(firstRoll + secondRoll + thirdRoll);
            }
            else if (slotsInput == 2)
            {
                System.out.println("Goodbye!");
                slots = false;
                Menu.userMenuLoop();
            }
        }
    }
}
