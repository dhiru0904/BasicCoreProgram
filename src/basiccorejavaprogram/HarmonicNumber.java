package basiccorejavaprogram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        float sum=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        for(int i=2;i<=number;i++)
        {
            sum=sum+(float)1/i;
            System.out.println(sum+" ");
        }
        System.out.println("Harmonic series : "+sum);
    }
}
