public class Basic{
    public static void main(String[] args) {
        //各科目の点数を変数として定義
        int japanese=85;    //国語
        int math=90;        //数学
        int english=75;     //英語
        
        //平均点を計算（小数のためdouble型で計算）
        double average=(japanese+math+english)/3.0;

        //結果を表示
        System.out.println("３科目の平均点は"+average+"　点です");

        //型変換
        int i=(int)3.99;
        double d=10;
        System.out.println(i); 

        //文字列型
        String text="Hello World";
        System.out.println(text);

        //文字操作
        System.out.println("Hi!".repeat(3));
        System.out.println("Hello".length());

        //文字列メソッド
        String text2="Java";
        System.out.println(text2.toUpperCase());
        System.out.println(text2.toLowerCase());

        //ブール型
        int aa=5;
        int bb=10;
        System.out.println(aa<bb);
        System.out.println(aa==bb);

        //null参照
        String name=null;
        System.out.println(name);

        
    }
}