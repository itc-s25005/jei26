package d50;

/*
Q25のコードを参考に、「02468」が表示されるコードを作成してください
 */

public class Q25kadai {
    static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            if (i % 2 == 1)
                continue;
            System.out.println(i);
        }
    }
}
