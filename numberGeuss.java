

public class numberGeuss {
    public static void main(String[] args){
        System.out.println("How many numbers would you like?");
        int amountOfNumbers = Integer.valueOf(System.console().readLine());

        System.out.println("And how many guesses would you like?");
        int amountOfGuesses = Integer.valueOf(System.console().readLine());
        game(amountOfNumbers, amountOfGuesses);
    }

    private static void game(int upTo, int geusses){
        int number = (int)Math.floor(Math.random() * upTo);
        boolean successfullyGeussed = false;
        for(int i = 1; i <= geusses; i++) {
            boolean geuss = takeAGeuss(number, upTo);
            if (geuss == true) {
                successfullyGeussed = true;
                break;
            }
        }
        
        if (successfullyGeussed == true){
            System.out.println("You win!, would you like to play again? Y/N");
            playAgain();
        }else{
            System.out.println("The number was " + Integer.toString(number));
            System.out.println("You ran out of geusses, would you like to play again? Y/N"); 
            playAgain();
        }
    }

    private static boolean takeAGeuss(int number, int upTo) {
        System.out.println("Please enter your geuss for a number between 0 and " + Integer.toString(upTo));
        int geuss = Integer.valueOf(System.console().readLine());
        if (geuss > number) {
            System.out.println("Too high!");
        }else if (geuss < number) {
            System.out.println("Too low!");
        }
        return (geuss == number);
    }

    private static void playAgain() {
        boolean shouldPlayAgain = (System.console().readLine().equals("Y"));
        if (shouldPlayAgain) {
            System.out.println("How many numbers would you like?");
            int amountOfNumbers = Integer.valueOf(System.console().readLine());

            System.out.println("And how many guesses would you like?");
            int amountOfGuesses = Integer.valueOf(System.console().readLine());
            game(amountOfNumbers, amountOfGuesses);
        } else {
            System.out.println(shouldPlayAgain);
        }
    }
}