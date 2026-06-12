package d50;

/*
Q27を参考に「Cool」が出力されるよう変数「control」に代入される値を「2」にした上で
switch文を修正してください。

【期待される出力】
Cool

 */

public class Q27kadai {
    static void main(String[] args) {
        int control = 2;
        String mode;
        switch (control){
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "cool";
                break; // case 2 が実行されたあと、defaultに処理が移らないようにbreakをつけておく
            default:
                mode = "Wind";

                break;
        }
        System.out.println(mode);
    }
}
