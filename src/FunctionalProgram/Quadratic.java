package FunctionalProgram;

import java.util.Scanner;

public class Quadratic {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = input.nextInt();
        System.out.println("Enter value of b: ");
        int b = input.nextInt();
        System.out.println("Enter value of c: ");
        int c = input.nextInt();
        input.close();
        int delta=b*b-4*a*c;
        System.out.println("Equation is:a*x*x+b*x+c"+"\n");
        double x1=(-b+((double)Math.sqrt(delta)))/(2*a);
        double x2=(-b-((double)Math.sqrt(delta)))/(2*a);
        System.out.println("Roots of x are: ");
        System.out.print("x1: "+x1);
        System.out.print("x2: "+x2);
    }
}
