package src.d48;

public class Q24 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i ++) {  // 9回繰り返す
            if (i % 3 != 0) {  // i を3で割ってあまりが0ではないとき
                continue;
            }
            System.out.println(i);
        }
    }
}
