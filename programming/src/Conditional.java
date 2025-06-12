import java.util.Scanner;

public class Conditional {
    
    
    public static void main1(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("点数を入力してください：");
        int score=scanner.nextInt();

        if(score>=60){
            System.out.println("合格です");
            System.out.println("おめでとうございます！");
        }else{
            System.out.println("不合格です");
            System.out.println("もっとがんばりましょう");
        }
        System.out.println("処理を終了します");
        scanner.close();

       }

    //if-else if-else
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("点数を入力してください：");
        int score=scanner.nextInt();

        if (score>=90){
            System.out.println("優秀です");
            System.out.println("大変よくできました！");
        }else if(score>=60){
            System.out.println("合格です");
            System.out.println("おめでとうございます！");
        }else{
            System.out.println("不合格です");
            System.out.println("もっとがんばりましょう");
        }

        System.out.println("処理を終了します");
        scanner.close();
       }
    //if
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("点数を入力してください：");
        int score=scanner.nextInt();

        if(score>=60){
            System.out.println("合格です");

        }

        System.out.println("処理を終了します");
        scanner.close();

       }

    
}







