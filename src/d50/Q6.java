package d50;

public class Q6 {
    static void main(String[] args) {

        // コマンドライン引数を整数に変換して格納
        int min = Integer.parseInt(args[0]);

        // コマンドライン引数を整数に変換して格納
        int max = Integer.parseInt(args[1]);

        if (max < min) {  //max < min なら入れ替える
            int tmp = max;
            max = min;
            min = tmp;
        }

        PrimeNumbers primeNumbers = new PrimeNumbers();
        // オブジェクトの作成

        primeNumbers.initializePrimeNumbers(max);
        // 下記メソッドの設計により、引数にmaxを指定することがわかる

        int[] part = primeNumbers.getPart(min, max);
        //下記メソッドの設計により、引数にmin, maxを指定することができる

        // 拡張for文を使い、配列partのすべての要素を出力
        for (int prime : part) {
            System.out.printf("%d, ", prime);

        }

    }
}

// 素数判定列を保持し、指定された配列の素数を求める
class PrimeNumbers {

    // 素数判定配列
    boolean[] isPrimeNumbers;

    // 素数判定配列を設定するメソッド
    void initializePrimeNumbers(int max) {

        // 4.①: 最大値+1を要素数とする素数判定配列を用意
        isPrimeNumbers = new boolean[max + 1];

        // 2から999のは２とするためi = 2としている
        for (int i = 2; i <= max; i++) {

            // 4.②: 素数判定要素をすべてtrueに初期化する
            isPrimeNumbers[i] = true;
        }

        // pが最大値の正の平方根を超えるまで④⑤の手順を繰り返す
        // 4.③: 素数をして2をpに設定する
        // 4.⑤: 素数判定配列pの次の素数を先頭から探索し、pへ設定する(p++)
        for (int p = 2; p <= Math.sqrt(max); p++) {  //*

            // pが素数であれば、倍数をfalseに設定する
            if (isPrimeNumbers[p]) {
                for (int m = p * 2; m <= max; m += p) { //*

                    // 4.④: 素数pの倍数をすべてfalseに設定する
                    isPrimeNumbers[m] = false;
                }
            }
        }
    }

    int[] getPart(int min, int max) {
        int count = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNumbers[n]) {
                count++;
            }
        }

        int[] part = new int[count];
        int index = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNumbers[n]) {
                part[index++] = n;
            }
        }

        return part;
    }

}