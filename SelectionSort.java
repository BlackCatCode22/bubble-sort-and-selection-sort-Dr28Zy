import java.util.Arrays;
import java.util.Random;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        System.out.println(Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome to Daniel's Selection Sort."); }

    private static void selectionSort(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = i + 1; j < length; j++){
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
