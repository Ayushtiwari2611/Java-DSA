public class Sorting {
    // 1. Bubble sort
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 2. Selection sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int previousElement = i - 1;
            // find out position for insertion
            while (previousElement >= 0 && arr[previousElement] > currentElement) {
                arr[previousElement + 1] = arr[previousElement];
                previousElement--;
            }
            // insertion process
            arr[previousElement + 1] = currentElement;
        }
    }

    // Counting Sort
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Practice Questions
    // 1. Buuble Sort
    public static void practiceBubble(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // 2. Selection Sort
    public static void practiceSelection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            // swap
            int temp=0;
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    // 3. Insertion Sort
    public static void practiceInsertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i;
            // find out position of insertion
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev] = curr;
        }
    }

    // 4.
    public static void practiceCounting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[i] = j;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int arr2[] = {1,4,1,3,2,4,3,7};
        int arr3[] = {3,6,2,1,8,7,4,5,3,1};
        // 1.
        // bubbleSort(arr);
        // printArr(arr);

        // 2.
        // selectionSort(arr);
        // printArr(arr);

        // 3.
        // insertionSort(arr);
        // printArr(arr);

        // 4. 
        countingSort(arr2);
        printArr(arr2);

        // 5.
        System.out.println();
        practiceBubble(arr3);
        printArr(arr3);

        // 6. 
        System.out.println();
        practiceSelection(arr3);
        printArr(arr3);

        // 7.
        System.out.println();
        practiceInsertion(arr3);
        printArr(arr3);

        // 8.
        System.out.println();
        practiceCounting(arr3);
        printArr(arr3);
        
    }
}
