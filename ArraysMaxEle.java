// Java Program to Find Max Element from an Array.

import java.util.*;
import java.util.Arrays;

public class ArraysMaxEle {
    public static void main (String args[]) {
        int arr[] = {1, 2, 3, 4, 5};

        int max = maxArr(arr);
        System.out.println(max);
    }

    static int maxArr(int arr[]) {
        int max = arr[0];
        for (int i : arr){
            if (i > max)
            max = i;
        }
        return max;
    }
}