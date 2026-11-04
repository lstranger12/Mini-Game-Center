import java.util.Scanner;

public class WordGuesser {
    public static void startWordGuesser(){
        System.out.println("\nWelcome to Legally Distinct Word Guesser™");
        boolean wordGuesser = true;
        Scanner wordGuesserInputScanner = new Scanner(System.in);

        String secretWord1 = "delta";
        String secretWord2 = "parer";
        String secretWord3 = "foyer";
        String secretWord4 = "coyly";
        String secretWord5 = "knoll";
        String secretWord6 = "tryst";
        String secretWord7 = "watch";
        String secretWord8 = "mummy";
        String secretWord9 = "fjord";
        String secretWord10 = "gawky";

        int randomWord = (int)(Math.random() * 10) + 1;

        String wordToGuess = "";
        if(randomWord == 1)
        {
            wordToGuess = secretWord1;
            System.out.println("Secret word selected.");
        }
        else if(randomWord == 2)
        {
            wordToGuess = secretWord2;
            System.out.println("Secret word selected.");
        }
        else if(randomWord == 3)
        {
            wordToGuess = secretWord3;
            System.out.println("Secret word selected.");
        }
        else if(randomWord == 4)
        {
            wordToGuess = secretWord4;
            System.out.println("Secret word selected.");
        }
        else if(randomWord == 5)
        {
            wordToGuess = secretWord5;
            System.out.println("Secret word selected.");
        }
        else if(randomWord == 6)
        {
            wordToGuess = secretWord6;
            System.out.println("Secret word selected.");
        }
        else if(randomWord == 7)
        {
            wordToGuess = secretWord7;
            System.out.println("Secret word selected.");
        }
        else if(randomWord == 8)
        {
            wordToGuess = secretWord8;
            System.out.println("Secret word selected.");
        }
        else if(randomWord == 9)
        {
            wordToGuess = secretWord9;
            System.out.println("Secret word selected.");
        }
        else if(randomWord == 10)
        {
            wordToGuess = secretWord10;
            System.out.println("Secret word selected.");
        }
        else
        {
            System.out.print("Error");
        }

        //------------------------------------------------------------------------------------------------------------------------------

        while(wordGuesser == true){
            System.out.println("\nGuess the 5 letter word.\n+ = in the correct place\n* = in the word but not in the correct placement\n- = not in the word\nThere are NO capital letters\n");

            String userWordGuess = wordGuesserInputScanner.nextLine();
            String correctness = "";

            if(userWordGuess.length() < 5 || userWordGuess.length() > 5){
                System.out.println("Enter a valid 5 letter word.");
            }
            else if(userWordGuess.length() == 5){
                for(int i = 0; i < userWordGuess.length(); i++){
                    if(userWordGuess.charAt(i) == wordToGuess.charAt(i)){
                        correctness += "+";
                    }else if(wordToGuess.contains("" + userWordGuess.charAt(i))){
                        correctness += "*";
                    }else{
                        correctness += "-";
                    }
                }
                System.out.println(correctness);
                if(correctness.equals("+++++")){
                    wordGuesser = false;
                    System.out.println("Word completed, thank you for playing.");
                    Menu.userMenuLoop();
                }
            }
            else{
                System.out.println("Error, please try again.");
            }
        }
    }
}
