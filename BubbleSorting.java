/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble.sorting;

/**
 *
 * @author ACER
 */
public class BubbleSorting {
    // Swap method for array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2};
        System.out.println("Before swap: " + numbers[0] + ", " + numbers[1]);

        // Call swap method
        swap(numbers, 0, 1);

        System.out.println("After swap: " + numbers[0] + ", " + numbers[1]);
    }
}
