import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int	div1 = num / 500;
        int happy1 = div1 * 1000;
        int div2 = (num - (div1 * 500)) / 5;
        int happy2 = div2 * 5;
        int sum = happy1 + happy2;
        System.out.println(sum);
    }
 }


 
