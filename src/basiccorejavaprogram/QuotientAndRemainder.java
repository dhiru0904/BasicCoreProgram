package basiccorejavaprogram;

import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quotient = 0, remainder = 0;
        System.out.print("Enter dividend and divisor: ");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println("Quotient : " + quotient);
        System.out.printf("Remainder : " + remainder);
    }
}

