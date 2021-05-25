/*3rd Java project. Took me ~5 minutes
Java is kinda wierd.
in Javascript you would do yourNum.tostring()
in lua you would do tostring(yourNum)
in python it would be str(yourNum)
But java be like Integer.toString(yourNum)

Anyways, this program prints the divisors of all the numbers 1 to 100, with all the divisors of a number being on the same line
*/
public class Divisors {
    public static void main(String[] args) {
        //Loop through 1 to 100
        for (byte i = 1; i <= 100; i++) {
            //Empty string for divisors
            String divisors = "";
            //Loop through 1 to the number
            for (byte d = 1; d <= i; d++) {
                //If the remainder of division is 0, its divisible
                if (i%d == 0) {
                    divisors += " " + Integer.toString(d); //So we convert to a string and concat it onto the divisors string
                }
            }
            System.out.println(divisors); //Print it :D
        }
    }
}
