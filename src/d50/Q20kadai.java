package d50;

public class Q20kadai {
    static void main(String[] args) {
        int num = 10;
        String scale = num > 1000 ? "Wide" : "Narrow";

        System.out.println(scale);
    }
}
/*
【メモ】
条件式 ? 処理A : 処理B
条件式がtrueの場合、処理Aの値が代入され、falseの場合、処理Bの値が代入される。
 */
