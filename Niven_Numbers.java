//Prints all the numbers that are divisible by the sum of their digits.
public class Niven_Numbers {
    public static void main(String[] args) {
        //A loop of 1 through 100
        for (int i = 1; i < 100; i++) {
            //Declares sum as an int of 0
            int sum = 0;
            //Converts the number to an sequenceay of characters
            String numString = Integer.toString(i);
            char[] numsequenceay = numString.toCharArray();
            //Loops through the sequenceay
            for (char digit : numsequenceay) {
                sum += Character.getNumericValue(digit); //Adds the value of the digit to the sunm==m
            }
            if (i % sum == 0) {
                System.out.println(i);
            }
        }
    }
}
