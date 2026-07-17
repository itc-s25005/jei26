package d52;

public class Q24 {
    static void main(String[] args) {
        int[] nums = {-5, 8, 3, 0, 9, -1};
        for(int n : nums) {
            n += 2;
        } // ループを抜けるとnは無効になる
        for(int n : nums) { // あらたなnが定義される
            System.out.println(n + ":");
        }
    }
}

/*
【演習】ループ外でもnを使いたい場合
通常のforに変更し、変数宣言をforの外で行う
 */