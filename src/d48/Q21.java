package src.d48;

public class Q21 {
    public static void main(String[] args) {
        int x, y = 25;

        x = y /= 4 + 3;
        System.out.println(x + " " + y);
    }
}
/*
[java 演算子の優先順位 : 四則演算と代入演算子]
1:乗除, 剰余     -> * / % (かける, 割る, あまり)
2:加減          -> + -
3:代入, 複合代入 -> = /= += など

※順位が小さい(上の)ものほど先に計算される( + < * 的な).
※整数同士の割り算は小数点以下が切り捨てになる.
 */
