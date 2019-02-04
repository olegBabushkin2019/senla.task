package orel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws Exception {
        int[] array = new int[5];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }
        }

        insertSort(array);

        //show, that our array has not changed and it can be sorted again
        System.out.println("OriginalArray: \n" + Arrays.toString(array));

        combSort(array);

        //output array
        System.out.println("combSort:");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    //comb sort with step = 1.247
    public static void combSort(int[] array) {

        final double X = 1.247;
        int step = (int) (array.length / X);

        while (step != 0) {
            for (int i = step, j = 0; i < array.length; ++i, ++j) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            step = (int) (step / X);
        }
    }

    //insertSort
    public static void insertSort(int[] array) {
        int[] arrayNew = Arrays.copyOf(array, array.length);
        for (int i = 1; i < arrayNew.length; i++) {
            if (arrayNew[i] > arrayNew[i - 1])
                for (int j = i; j > 0 && arrayNew[j] > arrayNew[j - 1]; j--) {
                    int temp = arrayNew[j];
                    arrayNew[j] = arrayNew[j - 1];
                    arrayNew[j - 1] = temp;
                }
        }
        System.out.println("insertSort:");
        System.out.println(Arrays.toString(arrayNew));
    }
}
