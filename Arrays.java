import java.util.*;

public class Arrays {
    public static void main (String args[]) {
        int arr[] = new int[5];                 // Declaring an array of 5

        System.out.print("Enter 5 numbers: ");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {           // Taking user input for array
            arr[i] = input.nextInt();
        }

        System.out.println("\nYour Array is:");

        for (int a : arr){                      // Printing array using for each loop
            System.out.print(a + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < arr.length; i++) {  // Printing array using regular for loop and ( arr.length )
            System.out.print(arr[i] + " ");
        }
    }
}