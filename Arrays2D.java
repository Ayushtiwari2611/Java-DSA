import java.util.Scanner;

public class Arrays2D {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static int findlargest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static void spiralmatrix(int matrix[][]) {
        int startRow = 0, startCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static int diagonalMatrix(int matrix[][]) {
        int sum = 0;

        // time complextity - O(n^2)
        // for(int i=0; i<matrix.length; i++){
        // for(int j=0; j<matrix[i].length; j++){
        // if(i==j){
        // sum += matrix[i][j];
        // } else if(i+j == matrix.length-1){
        // sum += matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < matrix.length; i++) {
            // Primary
            sum += matrix[i][i];
            // Seconndary
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    // Staircase Search - taking top-right as starting point
    public static boolean staircaseSearch(int matrix[][], int key){
        int row=0, col = matrix[0].length-1;
        while(row<matrix.length && col >=0){
            if(matrix[row][col] == key){
                System.out.println("found "+key+ " at ("+row+","+col+")");
                return true;
            } else if(key < matrix[row][col]){
                col--;
            } else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
     
    // Staircase Search - taking bottom-left as starting point
    public static boolean staircaseSearch2(int matrix[][], int key){
        int row = matrix.length-1, col= 0;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("found "+key+ " at ("+row+","+col+")");
                return true;
            } else if(key < matrix[row][col]){
                row--;
            } else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    // Question-1: print the number of 7s that are in the 2D array
    public static int question1(int arr[][], int key){
        int count =0;
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == key){
                    count++;
                }
            }
        }
        return count;
    }

    // Question-2: Print out the sum of the numbers in the second row of the “nums” array
    // Question-3: Write a program to FindTransposeofa MatrixS

    public static void main(String[] args) {
        // create 2D array
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        // taking input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // print output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // call search function
        search(matrix, 10);

        // call largest function
        System.out.println(findlargest(matrix));

        int newMatrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiralmatrix(newMatrix);

        // call diagonal sum
        System.out.println(diagonalMatrix(newMatrix));

        int matrix3[][] = {{10,20,30,40}, {15,25,35,45},{27,29,37,48}, {32,33,39,50}};
        staircaseSearch(matrix3, 27);
        staircaseSearch2(matrix3, 48);

        int arr[][] = {{4,7,8}, {8,8,7}};
        System.out.println(question1(arr, 4));
        // System.out.println(question2(arr));

    }
}
