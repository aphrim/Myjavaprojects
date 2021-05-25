//Recaman Sequence https://rosettacode.org/wiki/Recaman%27s_sequence
public class Recaman {
    public static void main (String[] args){
        int[] sequence = new int[100];//Inits the sequence with a length of 100 right off of the bat
        int l = 0; //Var that is used for storing current number. 
        System.out.println(l); //Since the first number of the sequence is 0, it prints 0
        //Looping from 1 to 100. Is byte to convserve memory, it saves 3 bytes of memory, which isnt much in this small or a program but adds up so optimizations like this are nice
        for (byte i = 1; i < 100; i++)
        {
            l = sequence[i-1]-i;//Set l equal to the value of output from last loop minus the iteration of this loop
            //Loop through 0 to the iteration of this loop, once again lets save 3 bytes of memory
            for (byte d = 0; d < i; d++)
            {        
                if ((sequence[d]==l) || l<0)//If this number was already in the sequence  or the number is less than 0
                {
                    l = sequence[i - 1] + i; //Sets l to the value of the last value in the sequence + the iteration
                    break; //breaks the for loop
                }
            }
     
            sequence[i] = l; //The value of the index of the iteration of the sequence is set to the number
            System.out.println(l); //And we print this
        }
    }
}
