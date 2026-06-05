package d50;

public class Q27 {
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
