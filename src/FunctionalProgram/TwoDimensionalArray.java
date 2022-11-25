package FunctionalProgram;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int n = scanner.nextInt();
        //Methods calling
        int [][] a  =arrayInt(m,n);
        double [][] b  =arrayDouble(m,n);
        String [][] c  =arrayBoolean(m,n);
        display(a,b,c,m,n);
    }
    public static int[][] arrayInt(int m,int n)
    {
        int[][] a =new int[m][n];
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("Integer Array");
        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                a[i][j] = scanner.nextInt();
            }
        }
        return a;
    }
    public static double[][] arrayDouble(int m,int n)
    {
        double[][] b =new double[m][n];
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("Double Array");
        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                b[i][j] = scanner.nextDouble();
            }
        }
        return b;
    }
    public static String[][] arrayBoolean(int m,int n)
    {
        String[][] c =new String[m][n];
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("Boolean Array");
        for(int i = 0; i<m; i++)
        {for (int j = 0; j<n; j++)
            {
                c[i][j] = scanner.next();
            }
        }
        return c;
    }
    //display method
    public static void display(int[][]a,double[][]b,String[][]c,int m,int n)
    {
        PrintWriter printwriter=new PrintWriter(System.out,true);
        //Display integers
        System.out.println();
        printwriter.println("TWO DIMENSIONAL ARRAY INTEGER");
        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                printwriter.print("\t"+a[i][j]+" ");
            }
            printwriter.println("\t");
        }
        //Display double
        System.out.println();
        printwriter.println("TWO DIMENSIONAL ARRAY DOUBLE");
        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                printwriter.print("\t"+b[i][j]+" ");
            }
            printwriter.println("\t");
        }
        //Display boolean
        System.out.println();
        printwriter.println("TWO DIMENSIONAL ARRAY BOOLEAN");
        for(int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                printwriter.print("\t"+c[i][j]+" ");
            }
            printwriter.println("\t");
        }
    }
}
