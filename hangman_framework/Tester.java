import java.util.Scanner;

public class Tester{

    public static void main(String [] args){
        System.out.println("Enter the word to guess");
        Scanner scan = new Scanner(System.in);
        String inputWord = scan.nextLine();

        String lettersGuessed= "";
        Board board = new Board(inputWord);

        String input = "";

        boolean correct = false;

        while (board.getLives() > 0 || board.allLettersFilled()){ /* FIX THIS WHILE LOOP CONDITION */
            int remaining_lives = board.getLives();

            if (remaining_lives == 6){
                System.out.println(Hangman.base());
            }

            if (remaining_lives == 5){
                System.out.println(Hangman.strikeOne());
            }

            if (remaining_lives == 4){            
                System.out.println(Hangman.strikeTwo());
            }
            
            if (remaining_lives == 3){
                System.out.println(Hangman.strikeThree());
            }

            if (remaining_lives == 2){
                System.out.println(Hangman.strikeFour());        
            }
            
            if (remaining_lives == 1){
                System.out.println(Hangman.strikeFive());
            }

            if (remaining_lives == 0){
                System.out.println(Hangman.strikeSix());
                break;
            } 

            if (board.allLettersFilled()){
                System.out.println("You are amazing at Hangman. STOP CHEATING!");
                break;
            }
            
            if (input.equals("0430")){
                System.out.println(inputWord);

            }    
            /**
             *
             * ENTER YOUR CODE HERE
             * NUMBER OF LIVES REMAINING: board.getlives();
             *
             */

            if(!board.getIncorrectGuesses().equals("\n")){
                System.out.println("Letters Guessed: " + board.getIncorrectGuesses());
            }

            System.out.println(board.toString());
            System.out.println("Enter your guess");

            input = scan.nextLine();
            input = input.substring(0,1);

            correct = board.setMove(input);
            board.updateNumberOfLives(correct);

            if(!correct){
                lettersGuessed += input + " ";
            }
        }

        if(!correct){
            System.out.println(Hangman.strikeSix());
            System.out.println("GAME OVER, LITERAL LOSER!");
        }
        else{
            System.out.println(board.toString());
            System.out.println("VICTORY!");
        }
       

    }
}
