package d49;

public class Q27Rensyu {
    static void main(String[] args) {
        int num[] = {10, 20, 30};
        int sum = 0;

        // 通常のfor文
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println();  // 見やすくするための改行

        // 拡張for文
        for (int n: num) {  // こっちが正しいらしい
            sum += n;
        }
        System.out.println(sum);
    }
}
