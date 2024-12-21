// Linear Search in java

import java.util.*;
import java.util.Arrays;

public class LinearSearch {
    public static void main (String args[]) {
        int arr[] = {1, 34, 23, 56, 65, 24, 76, 45, 87};

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println(result + " target not found");
        }
        else {
            System.out.println("target " + target + " found at " + result);
        }
    }

    static int linearSearch (int arr[], int target) {
        if (arr.length == 0)                            // Check if array is empty or not.
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) 
                return i;
        }

        return -1;
    }
}