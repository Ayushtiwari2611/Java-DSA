import java.util.Scanner;
public class Functions {

    // Simple functions
    public static void printHelloWorld() {
        System.out.println("Hello World");
        return;
    }

    // functions with parameters
    public static int calculateSum(int a, int b) { // parameters or actual parameters
        int sum = a + b;
        return sum;
    }

    // function for swappig two numbers
    public static void swap(int x, int y, int temp){
        temp= x;
        x=y;
        y=temp;
        System.out.println("x: "+x +" and y: "+y);
    }

    // function for multiply 2 numbers
    public static int multiply(int a, int b){
        int prod = a*b;
        return prod;
    }

    // function for finding factorial
    public static int factorial(int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;
    }

    // function for calculating binomial coefficient
    // nCr = n!/(r!* (n-r)!)
    public static int binomialCoefficient(int p, int q){
        int n_fact = factorial(p);
        int r_fact = factorial(q);
        int nr_fact = factorial(p-q);
        int bc = n_fact/(r_fact*nr_fact);
        return bc;
    }

    public static void main(String[] args) {
        printHelloWorld(); // function calling

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println("sum is : " + sum);


        //swap two variabales
        swap(3,5,0);

        // multiply
        int product = multiply(10,5);
        System.out.println(product);

        // factorial
        System.out.println(factorial(7));

        // binomial coefficient
        System.out.println(binomialCoefficient(5, 2));
    }
}


// methods - vo functions jo ek class ke ander likhe jaate hai
// 2 types of methods
// 1. User Defined Methods - vo jo programmer khud se likhta hai
// 2. Inbuilt Methods - jo programmers ko pehle se bane banaye milte hai