public class Q5_1_3 {
    public static void recursive_function(){
        System.out.println("재귀 함수를 호출합니다.");
        recursive_function();
    }
    public static void main(String[] arg) throws Exception{
        recursive_function();   
    }
}
