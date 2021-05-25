//My first java program!
//Well actually Hello World was my first but that was too basically
//IMO fizzbuzz is the best thing to do in a new language.
//Its kinda a tradition for me to do FizzBuzz whenever I do a new language
public class Fizzbuzz {
    public static void main(String[] args) {
        //Loops through 1 to 100
        for (int i = 1; i <= 100; i++) {
            //If its divisible by 3 and 5 it prints FizzBuzz
            if(i % 5 == 0 && i % 3== 0) {
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0) { //If its divisible by only 5 then it prints Buzz
                System.out.println("Buzz");
            }else if(i % 3 == 0) { // If its only divisible by 3
                System.out.println("Fizz");
            }else {
                System.out.println(i); //If its not divisible by either it just prints the number
            }
        }
    }
}