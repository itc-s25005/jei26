package d51;

public class Q6 {
    static void main(String[] args) {

        // 大分類の記録
        Item[] li = {
                new Item("AA", "魚類"),
                new Item("BB", "肉類")
        };

        // 小分類の記録。class Itemを読んだらわかりやすい?
        Item[] si = {
                new Item("A1", "さば"),
                new Item("A2", "さんま"),
                new Item("B1", "牛肉"),
                new Item("B2", "鶏肉"),
                new Item("B3", "豚肉")
        };

        ItemMaster im = new ItemMaster(li, si);
        // substring(文字列の一部を抽出する機能らしい)を使って
        // 大分類コードをlcode, 小分類コードをscode, 詳細コードをdetailsへ代入
        String lcode = args[0].substring(0, 2);
        String scode = args[0].substring(2, 4);
        String details = args[0].substring(4);

        // 商品コードから得た大分類名(小分類名)の名称をItemMaster(im)から取得
        String lname = im.getItemName(im.MAJOR, lcode);
        String sname = im.getItemName(im.MINOR, scode);

        // 出力
        System.out.println("商品コード" + args[0]);
        System.out.println("大分類名" + lname);
        System.out.println("小分類名" + sname);
        System.out.println("詳細コード" + details);
    }
}

// 大分類コードまたは小分類コード、それに対応する名称を記録するためのクラス
class Item {
    // メンバ変数code
    private String code;  // このクラスからのみアクセス可能
    private String name;  // 同様

    // コンストラクタ。newされたときに呼び出され、メンバ変数を初期化
    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // code(name)の値を外部から取得するためのゲッターメソッド。
    // メンバ変数への安全な窓口
    public String getCode() { return code; }
    public String getName() { return name; }
}

// すべての項目の管理。
// 大分類コード(小分類コード)に対応する名称を返す処理を行う。
// 商品マスタ(取り扱うすべての商品に関する情報を標準化して一元的に管理するデータベースらしい)
class ItemMaster {

    public int MAJOR = 0;
    public int MINOR = 1;

    private Item[][] items;
    ItemMaster(Item[] major, Item[]minor) {
        items = new Item[2][];
        items[MAJOR] = major;
        items[MINOR] = minor;
    }
    public String getItemName(int codeLevel, String code) {
        for (int i = 0; i < items[codeLevel].length ; i++) {
            if (code.equals(items[codeLevel][i].getCode())) {
                return items[codeLevel][i].getName();
            }
        }
        // 大分類コードや小分類コードに対応する名称がない場合は
        // (不明)という文字列を返す
        return "(不明)";
    }
}
