package d51;

/*
問題集Q27のコードを参考に、信号機の色をenum定数に設定し、「青」を出力するオリジナルコードを作成しましょう
 */

enum Traffic {青, 黄色, 赤}
public class Q27kadai {
    static void main(String[] args) {
        Traffic blue = Traffic.青;
        System.out.println(blue);
    }
}
