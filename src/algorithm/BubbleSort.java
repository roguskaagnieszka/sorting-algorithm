package algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void getAlgorithm() {
//        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter = 0;

        System.out.println("Before: ");
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            counter++;
            while (array[i - 1] > array[i]) {
                for (int j = 0; j < array.length - i; j++) {
                    counter++;
                    if (array[j] > array[j + 1]) {
                        counter++;
                        int greater = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = greater;
                    }

                }
            }
        }
        System.out.println("After: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Counter: " + counter);
    }

}
