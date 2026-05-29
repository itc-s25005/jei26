package d49;
/*
Q22のプログラムを参考に、変数lengthの内容を変更し、コンパイル及び実行した際、「Long」と表示されるようアレンジしてください
 */
public class Q22kadai {
    static void main(String[] args) {
        //int length = 1600;
        int length = 2500;
        String type;
        if (length < 1000) {
            type = "Short";
        } else if (length > 2000) {
            type = "long";
        } else {
            type = "Standard";
        }
        System.out.println(type);
    }
}
