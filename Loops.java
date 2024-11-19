import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while loop
        // eg.
        int count = 0;
        while (count < 100) {
            count++;
            System.out.println("hello world " + count);
        }

        // print number 1 to 10
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
            System.out.println();
        }

        // print numbers from x to y
        System.out.print("Enter first value : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int y = sc.nextInt();
        // while(x <= y){
        // System.out.print(x + " ");
        // x++;
        // }

        // print sum of first n natural numbers
        int sum = 0;
        while (x <= y) {
            sum += x;
            x++;
        }
        System.out.println("the sum is : " + sum);

        // for Loop
        System.out.print("Enter the interger : ");
        int n = sc.nextInt();
        // for(int i=0; i<=n; i++){
        // System.out.println("hello world "+ i);
        // }

        // print square pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // print reverse of a number
        int number = 1089945;
        int reverse = 0;
        // while(number>0){
        // int lastdigit = number%10;
        // System.out.print(lastdigit);
        // number =number/10;
        // }
        // System.out.println();

        while (number > 0) {
            int lastdigit = number % 10;
            reverse = (reverse * 10) + lastdigit;
            number = number / 10;
        }
        System.out.println(reverse);

        // break statement
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) {
                break;
            }
            
        }
        System.out.println("i am out of the loop");

        // print numbers untill the number is multiple of 10
        do{
            System.out.print("Enter the number : ");
            int nums1 = sc.nextInt();
            if(nums1%10 == 0){
                break;
            }
            System.out.println(nums1);
        }while(true);
        System.out.println("found a multiple of 10");

        // continue statement
        for(int i=0; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

        // print all numbers except the multiple of 10
        do{
            System.out.print("Enter the number : ");
            int nums2 = sc.nextInt();
            if(nums2%10 == 0){
                continue;
            }
            System.out.println(nums2); 
        }while(true);

        // check if number is prime or not
        // System.out.println("enter the value");
        // int value = sc.nextInt();
        // boolean isPrime = true;
        // for(int i=2; i<=n-1; i++){
        //     if(n%i == 0){ // value is multiple of i
        //         isPrime = false;
        //     }
        // }
        // if(isPrime==true){
        //     System.out.println("Value is prime");
        // } else{
        //     System.out.println("Value is not prime");
        // }

        // q.3 Factorial of a number
        
        
    }

}
