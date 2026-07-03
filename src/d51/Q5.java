package d51;

public class Q5 {
    static void main(String[] args) {
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE};  // 2.1:使用権のレベル
        double[] unit = {0.0, 2.0, 3.0, 5.0};  // 2.1:単位数
        int[] rate = {0, 19, 17, 14};  // 2.1 : 従量料金単価
        if(args.length != 1) {  // 1:実装値が一つ以外の場合エラー処理
            System.out.println("引数の個数が不正");
            return; // プログラムを終了する
        }

        // コマンドラインから受け取ったガス使用量を実数(double)に変換後してamountに代入
        double amount = Double.parseDouble(args[0]);

        // 1:実装値が負の値だった場合のエラー処理
        if (amount < 0.0) {
            System.out.println("0.0以上の使用量を入力");
            return;  // プログラムを終了
        }

        // 2.2:priceの初期値の基本使用料(1200円)を代入しておく
        int i, price = 1200;

        // 使用権ごとに料金を算出するための繰り返し
        for (i = 1; amount >= level[i]; i++) {

            // 2.4: 計算式を使って使用権ごとの従量料金を求め、priceに合計している
            price += (int) ((level[1] - level[i - 1] / unit[i])) * rate[1];
        }

        price += (int) Math.ceil((amount - level[i - 1]) / unit[i]) * rate[i];
        System.out.println("今月のガス料金" + price + "円");
    }
}
