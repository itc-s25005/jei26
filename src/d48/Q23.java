package src.d48;

public class Q23 {
    public static void main(String[] args) {
        int i = 1;
        for (;;) { // (;;) = 無限ループ
            i = i + 3;
            if (i < 10) {
                System.out.println(i);
                continue;  // 次のループに行く
            } else {
                break;  // ループの終了
            }
            // System.out.println(i); 到達不能のためコンパイルエラー発生
        }
    }
}
