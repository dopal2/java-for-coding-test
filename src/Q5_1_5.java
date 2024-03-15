public class Q5_1_5 {
    public static int factorial_iterative(int n){
        int answer = 1;
        for(int i=1; i<=n; i++) answer*=i;
        return answer;
    }
    public static int factorial_recursive(int n){
        if(n <= 1) return 1;
        return n*factorial_recursive(n-1);
    }
    public static void main(String[] arg) throws Exception{
        System.out.printf("반복적으로 구현 : %d\n", factorial_iterative(5));
        System.out.printf("재귀적으로 구현 : %d\n", factorial_recursive(5));
    }
}
