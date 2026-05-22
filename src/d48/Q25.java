package d48;

public class Q25 {
    String cord; // フィールド (クラスが持つデータ)
    public static void main (String[] args) {
        Q25 obj = new Q25();  // Q25クラスをインスタンス化して、odjという名前の変数に格納
        //obj.setCord;
        //obj.setCord();
        obj.setCord("FB1257");  // obj のセットコードを使い、文字列をセット
        //obj.setCord('FB1257');
        System.out.println(obj.cord);
    }
    void setCord(String s) {  // 引数で受け取った文字列をフィールド「cord」に代入
        cord = s;
    }
}

//*-----メモ-----*//
// Javaでは、文字列をを指定する場合、""(ダブルコーテーション)で囲む必要がある
// ''シングルコーテーションは、1文字だけ(char型)を扱うときに使うため、混合しない

