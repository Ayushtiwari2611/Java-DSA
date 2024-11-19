import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println(a + " is largest or equal");
        } else {
            System.out.println(b + " is largest or equal");
        }

        // 2.
        int n1 = 1, n2 = 3, n3 = 6;
        if ((n1 >= n2) && (n1 >= n3)) {
            System.out.println(n1);
        } else if (n2 >= n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

        // 3. ternary operator
        int nums = 57;
        String type = (nums % 2 == 0) ? "even" : "odd";
        System.out.println(type);

        // 4. switch case
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("ayush");

                break;
            case 2:
                System.out.println("tiwari");
                break;

            default:
                System.out.println("none");
                break;
        }

        // 5. Calculator
        System.out.print("Enter x = ");
        int x = sc.nextInt();
        System.out.print("Enter y = ");
        int y = sc.nextInt();
        System.out.print("Enter operator : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            case '%':
                System.out.println(x % y);
                break;
            default:
                System.out.println("wrong operator");
                break;
        }

        // question 1
        System.out.print("Enter an integer : ");
        int abc = sc.nextInt();
        if (abc >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // question 2
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("Fever");
        } else {
            System.out.println("No fever");
        }

        // question 3
        System.out.print("enter week number from 1 to 7: ");
        int weeknumber = sc.nextInt();
        switch (weeknumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("No week day");
                break;
        }

        // question 4
        int p = 65, q = 36;
        boolean bool = (p < b) ? true : false;
        System.out.println(bool);
        int integr = (p > q) ? p : q;
        System.out.println(integr);

        // question 5
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }

    }
}
