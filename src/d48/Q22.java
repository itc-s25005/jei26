package src.d48;
enum Connection {OFFLINE, ONLINE}

public class Q22 {
    public static void main(String[] args) {
        // Connection s = OFFLINE; コンパイルエラーが発生する
        Connection s = Connection.OFFLINE;
        if (s == Connection.OFFLINE) {
            s = Connection.ONLINE;
        }
        System.out.println(s);
    }
}
