package d51;

/*
・int型の変数 score に 75 を代入する
・条件演算子を使い、scoreが60以上なら"合格"、未満なら"不合格"をString型の変数 result に代入する
・result を出力する

【実行結果】
合格
 */

public class Q20kadai {
    static void main(String[] args) {
        boolean flg = true;
        int score = 75;
        String result = (flg = score > 60) ? "合格" : "不合格";
        System.out.print(result);
    }
}
