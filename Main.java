import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 変数宣言・初期化
        double width, height;
        Scanner sc = new Scanner(System.in);

        // キーボードからの入力（width/横の長さ）
        System.out.print("width: ");
        width = sc.nextDouble();

        // キーボードからの入力（height/縦の長さ）
        System.out.print("height: ");
        height = sc.nextDouble();

        // 周囲の長さの計算・表示
        System.out.print("circumference: ");
        System.out.println(width + width + height + height);

        // 面積の計算・表示
        System.out.print("area: ");
        System.out.println(width * height);

        // 入力の終了
        sc.close();
    }
}