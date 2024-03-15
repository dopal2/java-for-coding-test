import java.util.Scanner;

public class Q3_4 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int answer = 0;
        while (N!=1) {
            if(N%K == 0){
                N = N/K;
            }else{
                N--;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
