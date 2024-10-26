import java.util.Scanner;

public class fibinachiNum {
    public static void main(String[] args) {
       System.out.print("Enter wanted fabbinaci: ");

      Scanner input = new Scanner(System.in);
      int n = input.nextInt();

      int a = 0;
      int b = 1;
      int count = 2;

      for(int i = count; i <= n; i++) {
        int tem = b;
        b = a + b;
        a = tem;
      }

      System.out.println("your " + n + "th fibbinachi number is: " + b);
    }

}