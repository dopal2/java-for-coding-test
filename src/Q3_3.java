import java.util.Arrays;
import java.util.Scanner;

public class Q3_3{
    //  실전문제 3 숫자 카드 게임
    //  
    //  
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N;i++){
            int getMin = 0;
            for(int j=0; j<M; j++){
                int getNum = sc.nextInt();
                if(getNum<getMin || j==0) getMin = getNum;
            }
            arr[i] = getMin;
        }
        Arrays.sort(arr);
        System.out.println(arr[N-1]);
    }
}