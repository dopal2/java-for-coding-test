import java.util.Arrays;
import java.util.Scanner;

public class Q3_2 {
    // 실전문제 2 큰 수 법칙
    //
    //
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[N-1];
        int sec = arr[N-2];
        int count = 0;
        int answer = 0;
        while (true) {
            for(int i=0; i<K; i++){
                if(count==M) break;
                answer+=max;
                count++;
            }
            if(count==M) break;
            answer+=sec;
            count++;
        }
        System.out.println(answer);
    }
}
