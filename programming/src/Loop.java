public class Loop {
    public static void main(String[] args){
        //for
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        //for-each
        int[] numbers={2,4,6,8,10};
        
        for(int num:numbers){
        System.out.println(num);
        } 
        
        //while
        int i=0;
        while(i<10){
            i++;
            System.out.println(i);
        } 
        System.out.println("処理を終了します");
        
        //do-while
        int n=0;
        do{
            System.out.println("nの値は："+n);
            n++;
        }while(n<3);
        
        //break
        int m=0;
        while (true){
            m++;
            if(m>10){
                break;
            }
            System.out.println(m);
        }
        System.out.println("処理を終了します");

        //continue
        int l=0;
        while(true){
            l++;
            if(l>10){
                break;
            }
            if(l%2==1){
                continue;
            }
            System.out.println(l);
        }
        System.out.println("処理を終了します");
    } 
    
}




