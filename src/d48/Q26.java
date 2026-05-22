package d48;

public class Q26 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while (++i < 8) {
            sum += i;
        }
        System.out.println(sum);
    }
}

/*
1回目: iが0から1に増える -> 1 < 8 はOK -> sumに1を足す
(中略)
7回目: iが6から7に増える -> 7 < 8 はOK -> sum に7を足す
8回目: iが7から8に増える -> 8 < 8 はNG
答えは 「28」になる

【メモ】
++i : 使う前に1増やす
i++ : 使ったあとに1増やす
 */
