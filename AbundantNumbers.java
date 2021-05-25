//A number which is less than the sum of its divisors https://rosettacode.org/wiki/Abundant,_deficient_and_perfect_number_classifications
//Instead of printing the numbers that match this sequence from 1 to 100, ima do the first 100 numbers of sequence.
public class AbundantNumbers {
    public static void main(String[] args) {
        int i = 0; //The count its successfully found an abundant number
        int i2 = 0; //The current number its on
        while (i<100) { //While its found less than 100 abundant numbers
            if (isAbundant(i2) == true) { //If the number is abundant
                System.out.println(i2); //It prints it out
                i++; //Increments the amount of times its found an abundant number
            }
            i2++; //No matter what it increments the number its on
        }
    }

    private static boolean isAbundant(int num) {
        int sum = 0;//The sum
        for (int i=1; i<num; i++) {//Loop from 1 to the input num
            if (num%i==0) { //If the remainder of division is 0, (is divisible)
                sum += i; //Adds to the sum this value, as its a divisor
            }
        }
        return (sum>num); //Returns whether the sum is greater than the number
    }
}
