public class BitManipulation {

    // Question-1 : Odd or Even check
        // if number is odd, then LSB of it's binary is always 1
        // else, the LSB is 0

        // AND (&) operation perform with number gives result for odd/even
        public static void oddOdEven(int n){
            int bitmask =1;
            if((n & bitmask)==0){
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
        }

        // Get ith bit
        // perform AND operation with (1<<i) with the number given
        public static int getIthBit(int n, int i){
            int bitmask = 1<<i;
            if((n & bitmask) == 0){
                return 0;
            } else{
                return 1;
            }
        }

        // Set ith bit
        // set the bit to 1
        // perform OR operation with (1<<i) with the number given
        public static int setIthBit(int n, int i){
            int bitmask = 1<<i;
            return n|bitmask;
        }

        // Clear ith bit - change 1 to 0
        // perform AND operation with ~(1<<i) with the number given
        public static int clearIthBit(int n, int i){
            int bitmask = ~(1<<i);
            return n & bitmask;
        }

        public static int updateIthBit(int n, int i, int newBit){
            // if(newBit == 0){
            //     return clearIthBit(n,i);
            // } else {
            //     return setIthBit(n, i);
            // }


            n = clearIthBit(n, i);
            int BitMask = newBit<<i;
            return n|BitMask;
        }

        public static int clearIBits(int n, int i){
            int BitMask = (~0)<<i;
            return n & BitMask;
        }

        public static int clearRange(int n, int i, int j){
            int a = ((~0)<<(j+1));
            int b = (1<<i)-1;
            int bitMask = a|b;
            return n & bitMask;
        }

        public static boolean isPowerOfTwo(int n){
            return (n & (n-1)) == 0;
        }

    public static void main(String[] args) {
        // Binary AND operator
        System.out.println(5&6);

        // Binary OR operator
        System.out.println(5|6);

        // Binary XOR operator
        System.out.println(5^6);

        // Binary 1's compliment (NOT operator)
        System.out.println(~5);
        System.out.println(~0);

        // Binary left shift (<<)
        // Formula - a<<b = a*(2^b)
        System.out.println(5<<2);

        // Binary right shift (>>)
        // Formula - a>>b = a/(2^b)
        System.out.println(5>>2);

        // call oddoreven
        oddOdEven(6);

        // call ithBit
        System.out.println(getIthBit(10, 3));

        // call setithbit
        System.out.println(setIthBit(10, 2));

        // call clearithbit
        System.out.println(clearIthBit(10, 1));

        // call updateithbit
        System.out.println(updateIthBit(10, 2, 1));

        // call clearRange
        System.out.println(clearRange(10, 2, 4));

        // call checkpowerofTwo
        System.out.println(isPowerOfTwo(8));
    }
}
