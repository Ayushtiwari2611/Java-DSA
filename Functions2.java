public class Functions2 {
    // function overloading - different functions with same name but different
    // having different type of parameters and number if parameters

    // function to add 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to add 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // function to add 2 numbers with float datatype
    public static float sum(float a, float b) {
        return a + b;
    }

    // function to find number is prime or not
    public static boolean isPrime(int n) {
        boolean isprimenumber = true;
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isprimenumber = false;
                    break;
                }
            }
        }
        return isprimenumber;
    }

    // optimize function for finding prime number
    public static boolean isprimeoptimized(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // function to find all primes in a range
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // function for converting binary to decimal
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " is " + decNum);
    }

    // function for converting decimal to binary
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("binary form of " + myNum + " is " + binNum);
    }

    // function for calculating average of 3 numbers
    public static int average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    // function for check the number is even or odd
    public static boolean isEvenOrOdd(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    // function to check the number is palindrome or not
    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (n == reverse) {
            return true;
        }
        return false;
    }

    // function for compute the sum of digits in an integer
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        System.out.println(sum(1, 5, 8));
        System.out.println(sum(2.5f, 4.62f));
        System.out.println(isPrime(8));
        System.out.println(isprimeoptimized(11));
        primesInRange(100);
        binToDec(112);
        decToBin(125);
        System.out.println(average(2, 5, 8));
        System.out.println(isEvenOrOdd(8));
        System.out.println(sumOfDigits(001));
        System.out.println(isPalindrome(64546));

    }
}

// scope
// method scope -
// block scope -
// class scope -