package d50;

/*
Q23をアレンジして
setCodeメソッドで得た文字列「Code」を出力するコードを作成してください。
 */

public class Q23 {
    String code;

    static void main(String[] args) {
        Q23 odj = new Q23();
        odj. setCode("Code");

        System.out.println(odj);
    }
    void setCode(String c) {
        code = c;
    }
}
