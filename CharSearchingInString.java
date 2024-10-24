// Java Program to Search a char in a String;

import java.util.Scanner;
import java.time.*;

public class Main {
    public static void CharSearchingInString(String[] args) {
      
        String str = "this is string";

        char target = 'r';

        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i))
            System.out.println(target + " found at "+ i);

        }

    }

}