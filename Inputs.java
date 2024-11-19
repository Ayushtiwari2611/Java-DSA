import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine();
        // System.out.println("String is "+input);

        // int num1 = sc.nextInt();
        // System.out.println("Num is "+num1);

        // float price = sc.nextFloat();
        // System.out.println("price is "+price);

        // sum of a & b
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);

        // Product of  a & B
        // float a1 = sc.nextFloat();
        // float b1 = sc.nextFloat();
        // float prod = a1*b1;
        // System.out.println(prod);

        // Type Conversion
        int a = 25;
        long b = a;
        // int c = b;
        System.out.println(b); 

        // float number = sc.nextInt();
        // System.out.println(number);


        // Type casting
        float val = 25.63f;
        int val2 = (int)val;
        System.out.println(val2);

        // byte -> short -> int -> float -> long -> double

        // Type Promotion
        byte by = 5;
        byte ay = (byte)(by*2);
        System.out.println(ay);

        // exercise
        //1.
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // double avg = (n1+n2+n3)/3;
        // System.out.println(avg);

        // 2.
        // float side = sc.nextFloat();
        // float areaOfSquare = side*side;
        // System.out.println(areaOfSquare);

        // 3.
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat(); 
        float eraser = sc.nextFloat(); 
        float sum = pencil + pen + eraser;
        float gst = 0.18f*sum;
        float bill = sum + gst;
        System.out.println(bill);

        // 4.
        byte byt = 4;
        char chr = 'a';
        short shrt = 512;
        int nt = 1000;
        float flt = 3.14f;
        double dbl = 99.9954;
        double result = (flt*byt)+(nt%chr) - (dbl*shrt);
        System.out.println("result : "+result);

        // 5.
        int $ = 24;
        System.out.println($);
// Java rule says that a variable will be starts from any alphabet, underscore or dollar sign in special characters.

// Operators in Java :-
// questions
// 1. 
int x=2, y=5;
int exp1= (x*y/x);
int exp2= (x*(y/x));
System.out.println(exp1 +" "+ exp2);

// 2.
int ab=200, ac=50, ad=100;
if(ab>ac && ac>ad){
    System.err.println("hello");
}
if(ad>ac && ad<ab){
    System.out.println("java");
}
if((ac+200)<ab && (ac+150)<ad){
    System.out.println("hello java");
}
    }
}

 


