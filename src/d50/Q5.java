package d50;

public class Q5 {
    static void main(String[] args) {
        int[] num = new int[args.length]; // argsの長さ分の配列を作成

        //配列numに変換した整数を格納するための繰り返し
        for (int i = 0; i < args.length; i++) {
            // 例 : 文字列10を整数10に変換するには、IntegerクラスのparseInt()というメソッドを使う
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;  // 値を入れ替える際に一時的に使う

        // 基本挿入法を行うアルゴリズム部分
        for (int i = 1; i < num.length; i++) { // 先頭は比較不要のためi=1から始まる
            for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--){  // j=i-1から左に向かって比較・
                tmp = num[j];           // num[i]を一時停止
                num[j] = num[j + 1];    // 右の値に移動
                num[j + 1] = tmp;       // 一時保存した値を右に移動
            }
        }

        // ソート完了後の配列を出力するための拡張for文
        for (int val : num) {
            System.out.println(val + " ");
        }
    }
}

// test