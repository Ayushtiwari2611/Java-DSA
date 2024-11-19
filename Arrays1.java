import java.util.Scanner;

public class Arrays1 {
    // List of elements of same type placed in a contigous memory location
    // operations - create, input, output, update

    // create an array
    // datatype arrayName[] = new datatype[size];
    // int numbers[] = {46, 67,36};

    // function to update the score of subjects
    public static void updateScore(int score[], int nonChangeable) {
        nonChangeable = 10;
        for (int i = 0; i < score.length; i++) {
            score[i] = score[i] + 1;
            System.out.print(score[i] + " ");
        }
    }

    // linear search - find the element on an index in a row of array
    public static String findElementUsingLinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return "the number " + numbers[i] + " is found on position: " + (i + 1);
            }
        }
        return "key is not found";
    }

    public static String findLargestInArray(int numbers[]) {
        int largestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNum) {
                largestNum = numbers[i];
            }
            if (numbers[i] < smallestNum) {
                smallestNum = numbers[i];
            }
        }
        return "largest: " + largestNum + " & smallest: " + smallestNum;
    }

    // binary search - check the key with mid value using start & end
    public static int findElementInBinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // reverse of an array
    public static void reverseOfAnArray(int numbers[]) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[right];
            numbers[right] = numbers[left];
            numbers[left] = temp;

            left++;
            right--;
        }
    }

    // pairs in an array
    public static void pairsInArray(int numbers[]) {
        int tp = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[50];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics: " + marks[0] + ", chemistry: " + marks[1] + ", maths: " + marks[2]);

        double percentage = (double) (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage: " + percentage);
        System.out.println("length of marks array : " + marks.length);

        // Passing arrays as arguments : 2 ways
        // pass by value
        // pass by reference
        int score[] = { 76, 83, 67 };
        int nonChangeable = 5;
        updateScore(score, nonChangeable);
        System.out.println(nonChangeable);

        int numbers[] = { 45, 22, 56, 10, 31, 76, 19, 83, 67, 51, 3 };
        System.out.println(findElementUsingLinearSearch(numbers, 31));

        System.out.println(findLargestInArray(numbers));
        System.out.println(findElementInBinarySearch(numbers, 19));

        reverseOfAnArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int nums[] = { 2, 4, 6, 8, 10 };
        pairsInArray(nums);
    }
}
