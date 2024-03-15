import java.util.Scanner;

public class Q3_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = {500,100,50,10};
        int answer = 0;
        int num = sc.nextInt();
        for(int coin : arr){
            answer += num/coin;
            num = num%coin;
        }
        System.out.println(answer);
    }
}
