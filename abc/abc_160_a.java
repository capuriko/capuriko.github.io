import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
            if (str.charAt(2) == str.charAt(3) ){
            	if (str.charAt(4) == str.charAt(5) ){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
             }else {
              System.out.println("No");
            }
    }
 }


 
