import java.util.*;
//入力値の±5の値をランダムに表示

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();
        
        int x = stdIn.nextInt();
        int lucky = rand.nextInt(11)+(x-5); // (0 ~ 10の乱数) + (x - 5) = (x-5 ~ x+5 の乱数) 
        System.out.println("今日のラッキーナンバーは" + lucky + "です！");
    }
    
}
