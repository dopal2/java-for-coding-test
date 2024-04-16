import java.util.Scanner;

public class Q4_1_1{
    //  예제 4-1 상하좌우
    //  
    //  
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 1;
        int y = 1;
        for(int i=0; i<6; i++){
            String str = sc.next();
            if(str.equals("R")){
                x+=1;
                if(x>N) x = N;
            }
            if(str.equals("L")){
                x-=1;
                if(x<1) x = 1;
            }
            if(str.equals("U")){
                y-=1;
                if(y<1) y = 1;
            }
            if(str.equals("D")){
                y+=1;
                if(y>N) y = N;
            }
        }
        System.out.println(y+" "+x);
    }
}