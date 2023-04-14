package Level2;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary integer: ");
        String binaryStr = input.nextLine();

        int decimal = 0;
        int base = 1;
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            int digit = binaryStr.charAt(i) - '0';
            decimal += digit * base;
            base *= 2;
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}




