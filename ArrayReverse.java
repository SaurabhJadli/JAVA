// Program to Reverse an Array.

import java.util.*;
import java.util.Arrays;

public class ArrayReverse {
    public static void main (String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array Before Reverse: " + Arrays.toString(arr));

        int reverse[] = reverse(arr);
        System.out.println("Array After Reverse: " + Arrays.toString(reverse));

    }

    static int[] reverse (int arr[]) {
        int rev[] = new int[arr.length];
        int lastIndex = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[lastIndex - i];
        }
        return rev;
    }
}