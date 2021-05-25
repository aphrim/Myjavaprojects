//Prints first 50 terms of the Fibbonaci Sequence
public class FibbonaciSequence {
    public static void main(String[] args) {
        /*Declares sequenceay of longs(So that the sequence can go above 2147483647, still capped at a number, 9 pentillion or something I think)
        The sequenceay stores the last number first at index 0, and then the second to last number at index 1*/
        long[] lastnums = {0L,1L};
        //Loop through 1 to 50. i is stored as a byte to conserve memory. It can't go above 128 for that reason so dont put >= 128 there.
        for (byte i = 1; i < 50; i++) {
            //New number is equal to the last number and second to last number added together
            long newNum = lastnums[0] + lastnums[1];
            //Last number is equal to the old second to last number
            lastnums[0] = lastnums[1];
            //Second to last number is now equal to the new number
            lastnums[1] = newNum;
            //And then we print the new number
            System.out.println(newNum);
        }
    }
}