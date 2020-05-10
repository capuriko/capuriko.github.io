import java.util.*;
//-1.0以上1.0未満の実数値をランダムに表示
public class Main {
    public static void main(String[] args) throws Exception {
        
    
        Random rand = new Random();
        
        double lucky = rand.nextDouble()*2-1; //-1から1までの幅は1-(-1)=2。そこから０からーになる数だけ引く（例：-２から5の場合
        System.out.println("今日のラッキーナンバーは" + lucky + "です！");
    }
    
}
