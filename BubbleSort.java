public class BubbleSort {

    //Swap method
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to sort an array using Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Loop to access each array element
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare and swap elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if the current element is greater than the next
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Method to print the elements of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print newline after the array
    }

    // Main method to test bubble sort
    public static void main(String[] args) {
        // Initialize array with 10 numbers
        int[] numbers = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};

        System.out.println("Original array:");
        printArray(numbers); // Print original array

        // Sort the array using bubbleSort method
        bubbleSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers); // Print sorted array
    }
}
