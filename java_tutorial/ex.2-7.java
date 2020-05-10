import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Random rand = new Random();
        
        int lucky = rand.nextInt(100)+10;  
        System.out.println("今日のラッキーナンバーは" + lucky + "です！");
    }
    
}
