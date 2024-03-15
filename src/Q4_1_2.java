import java.util.Scanner;

public class Q4_1_2 {
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;

        for(int h=0; h<N; h++){
            for(int m=0; m<60; m++){
                for(int s=0; s<60; s++){
                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if (check(h, m, s)) answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
