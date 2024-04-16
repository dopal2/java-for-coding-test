import java.util.Arrays;
import java.util.Scanner;

public class Q4_2 {
    //  실전문제 2 왕실의 나이트
    //  
    //  
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArr = {"", "a", "b", "c", "d", "e", "f", "g", "h"};
        int answer = 0;
        int x = Arrays.binarySearch(strArr, str.substring(0, 1));
        int y = Integer.parseInt(str.substring(1,2));

        //case1 L2
        if(x-2>0){
            if(y+1<9) answer++;
            if(y-1>0) answer++;
        }
        if(x-1>0){
            if(y+2<9) answer++;
            if(y-2>0) answer++;
        }
        if(x+1<9){
            if(y+2<9) answer++;
            if(y-2>0) answer++;
        }
        if(x+2<9){
            if(y+1<9) answer++;
            if(y-1>0) answer++;
        }
        

        System.out.println(answer);
    }
}
