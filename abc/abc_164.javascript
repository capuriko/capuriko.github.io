import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int num1 = (C-1) / B + 1;
        int num2 = (A-1) / D + 1;
        if ( num1 <= num2 ) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        scan.close();
    }
}

