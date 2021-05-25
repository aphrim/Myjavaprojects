//Geuss a number
public class numberGeuss {
    public static void main(String[] args){ //Starting function
        //Get amount of numbers and amount of geusses user gets
        System.out.println("How many numbers would you like?");
        int amountOfNumbers = Integer.valueOf(System.console().readLine());

        System.out.println("And how many guesses would you like?");
        int amountOfGuesses = Integer.valueOf(System.console().readLine());
        game(amountOfNumbers, amountOfGuesses);
    }

    //Main game function
    private static void game(int upTo, int geusses){
        int number = (int)Math.floor(Math.random() * upTo); //Random number from 0 upto number that user chose
        boolean successfullyGeussed = false; //Whether the user has geussed or not
        for(int i = 1; i <= geusses; i++) { //For i = 0, number of guesses
            boolean geuss = takeAGeuss(number, upTo); //Will return whether they geussed correct or not
            if (geuss == true) { //If its true
                successfullyGeussed = true; //Sets this to true
                break; //Breaks the for loop
            }
        }
        
        if (successfullyGeussed == true){ //If the guess was true
            System.out.println("You win!, would you like to play again? Y/N");
            playAgain(); //Calls play again function
        }else{
            System.out.println("The number was " + Integer.toString(number));
            System.out.println("You ran out of geusses, would you like to play again? Y/N"); 
            playAgain(); //Calls play again function
        }
    }

    private static boolean takeAGeuss(int number, int upTo) { //Returns a booleon of the geuss
        System.out.println("Please enter your geuss for a number between 0 and " + Integer.toString(upTo));
        int geuss = Integer.valueOf(System.console().readLine());//Get integer value of the input
        if (geuss > number) { //If the guess is greater than the number
            System.out.println("Too high!"); //Prints out too high
        }else if (geuss < number) { //If its lower
            System.out.println("Too low!"); //It prints out that its too low
        }
        return (geuss == number); //Returns whether the number is equal to the geuss
    }

    private static void playAgain() {
        boolean shouldPlayAgain = (System.console().readLine().equals("Y")); //If the user inputted Y 
        if (shouldPlayAgain) {
            System.out.println("How many numbers would you like?"); //Asks user for how many numbers they like
            int amountOfNumbers = Integer.valueOf(System.console().readLine()); //And inits a variable with it

            System.out.println("And how many guesses would you like?"); //Asks user for how many guesses they would like
            int amountOfGuesses = Integer.valueOf(System.console().readLine()); //Inits a value with what they input

            game(amountOfNumbers, amountOfGuesses);//Calls game function with the values from above
        } else {
            System.out.println("Goodbye!");
        }
    }
}