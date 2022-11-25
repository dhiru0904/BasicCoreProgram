package basiccorejavaprogram;
import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number power of 2 : ");
        int number = sc.nextInt();
        if(number>=0&&number<31){
            for(int i=0;i<=number;i++){
                if(i==0)
                    System.out.println("2 POWER"+i+"=1");
                else
                    System.out.println("2 POWER"+i+"="+(int)Math.pow(2,i));
            }
        }}}
