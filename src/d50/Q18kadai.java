package d50;

/*
問題集43ページQ18のコードを参考に以下のように動作するQ18Kadaiクラスを作成しましょう
numの初期値は6とし、while文の条件式を変更し
「5」「4」「3」「2」「1」と表示されるようにしてみてください
 */
public class Q18kadai {
    static void main(String[] args) {
        int num = 6;
        while (--num > 0){
            System.out.println(num);
        };
    }
}
