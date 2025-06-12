public class Operator {
    public static void main(String[] args){
        //算術演算子
        int a=10;
        int b=3;
        System.out.println("加算："+(a+b));
        System.out.println("割算："+(a/b));
        System.out.println("余り："+(a%b));

        double power=Math.pow(a,b);
        System.out.println("累乗："+power);

        //複合演算子
        int x=10;
        x+=5;
        System.out.println("x+=5:"+x);

        //比較演算子
        a=10;
        b=5;
        System.out.println("a>b:"+(a>b));
        System.out.println("a==b:"+(a==b));

        //論理演算子
        x=15;
        System.out.println(10<x&&x<20);
        System.out.println(!(x==15));

        //ビット演算子
        a=0b1100;
        b=0b1010;

        System.out.println("a&b:"+Integer.toBinaryString(a&b));
        System.out.println("a<<1:"+Integer.toBinaryString(a<<1));

        //if文
        import java.until.Scanner;

        public class Conditional{
            public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                System.out.print("点数を入力してください：");
                int score=scanner.nextInt();

                if(score>=60){
                    System.out.println("合格です");
                }

                System.out.println("処理を終了します");
                scanner.close();
            }
        }

    }
    
}
