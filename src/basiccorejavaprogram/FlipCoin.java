package basiccorejavaprogram;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        int number, head_count = 0, tail_count = 0;
        double heads, tails;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of times you want to flipping coin: ");
        number = scanner.nextInt();
        for (int j = 0; j < number; j++) {
            double random = Math.random();
            if (random < 0.5)
                head_count++;
            else
                tail_count++;
        }
        heads = head_count / (double) number * 100;
        tails = tail_count / (double) number * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");
    }
}
