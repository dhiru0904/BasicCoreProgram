package basiccorejavaprogram;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Before swapping numbers : " + number1 + " " + number2);
        //Swapping
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swapping numbers : " + number1 + " " + number2);
    }
}
