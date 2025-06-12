import java.util.Scanner;
public class Exc {
    //例外処理の基本構文
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int result=0;
        boolean success=false;
        try{
            System.out.print("整数を入力してください:");
            int num=Integer.parseInt(scanner.nextLine());
            result=100/num;
            success=true;
            
        }catch(ArithmeticException e){
            //０で割った場合
            System.out.println("エラー：０で割ることはできません");
        }catch(NumberFormatException e){
            //数値以外の入力があった場合
            System.out.println("エラー：整数を入力してください");
        }finally{
            scanner.close();
            if(success){
                System.out.println("計算結果："+result);
            }
            System.out.println("プログラム終了");
        }
        
        
    }
}



