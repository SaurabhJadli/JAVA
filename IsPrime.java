import java.util.*;

class IsPrime {
    public static void main (String args[]) {
        System.out.print("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        isPrime(n);
      
    }
    public static void isPrime(int n) {
        if (n % 2 == 0){
            System.out.println(n + " is prime");
        }
        else {
            System.out.println(n + " is NOT prime");
        }
    }
}