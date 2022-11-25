package FunctionalProgram;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        int distinct_count = 0;
        for (int i = 0; i < number - 2; i++)
            for (int j = i + 1; j < number - 1; j++)
                for(int k = j + 1; k < number; k++)
                    if ((arr[i] + arr[j] + arr[k]) == 0) {
                        distinct_count++;
                        System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                    }
        System.out.println("Total distinct triplets : " + distinct_count);
    }
}
