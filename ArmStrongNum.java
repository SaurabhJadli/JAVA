import java.util.*;

public class ArmStrongNum {
    public static void main (String args[]) {
        System.out.print("Enter Num: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int as = armStrong (n);

        System.out.println("Armstrong for " + n + " is " + as);
    }

    public static int armStrong(int n) {
        int as = 0;
        while (n < 0) {
            int r = n % 10;
            int cube = r * r * r;
            as += cube;
            n = n /10;
        }

        return as;
    }
}