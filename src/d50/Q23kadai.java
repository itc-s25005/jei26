package d50;

/*
Q23をアレンジして
setCodeメソッドで得た文字列「Code」を出力するコードを作成してください。
 */

public class Q23kadai {
    String code;

    static void main(String[] args) {
        Q23kadai odj = new Q23kadai();
        odj. setCode("Code");

        System.out.println(odj);
    }
    void setCode(String c) {
        code = c;
    }
}
