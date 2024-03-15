public class Q5_1_4 {
    public static void recursive_function(int n){
        if(n>100) return;
        System.out.printf("%d번째 재귀 함수에서 %d번째 재귀함수를 호출합니다.\n", n, n+1);
        recursive_function(n+=1);
    }
    public static void main(String[] arg) throws Exception{
        recursive_function(1);
    }
}
