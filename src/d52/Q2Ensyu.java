package d52;

/*
【演習】d52/Q2Ensyu.java
問題集問2(p79)のコードについて、Q2Ensyu.javaを作成し、実行用のQ2Ensyuクラスから実行例のように出力できるようコードを作成してください。
なお、Cookingクラス、Cookerクラスのpublic修飾子は外してclass Cooking{}、class Cooker{}としてコードを作りましょう。
(後ほど答え合わせします)

【実行例】
>java d52.Q2Ensyu
ステーキ
 */

public class Q2Ensyu {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        String s = cooker.getSteak();
        System.out.println(s);
    }
}

class Cooking {
    private String name;
    private int time;
    Cooking(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public String getName() { return name; }
    public int getTime() {return time; }
}

class Cooker {
    private Cooking c1 = new Cooking("ステーキ", 20);
    private Cooking c2 = new Cooking("ミニサラダ", 10);

    // 文字列「ステーキ」を返すためのメソッド
    public String getSteak(){ return c1.getName(); }
}
