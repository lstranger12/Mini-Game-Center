import java.util.Scanner;

public class SongGuesser {
    public static void startSongGuesser(){
        System.out.println("\nWelcome to Legally Distinct Word Guesser™");
        boolean wordGuesser = true;

        String secretWord1 = "";
        String secretWord2 = "";
        String secretWord3 = "";
        String secretWord4 = "";
        String secretWord5 = "";
        String secretWord6 = "";
        String secretWord7 = "";
        String secretWord8 = "";
        String secretWord9 = "";
        String secretWord10 = "";

        while(wordGuesser == true){
            Scanner wordGuesserInputScanner = new Scanner(System.in);

            int randomWord = (int)(Math.random() * 10) + 1;

            String wordToGuess;

            if(randomWord == 1)
            {
                wordToGuess = secretWord1;
            }
        }
    }
}
