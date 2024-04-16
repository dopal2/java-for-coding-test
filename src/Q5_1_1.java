import java.util.Collections;
import java.util.Stack;

public class Q5_1_1 {
    //  5-1 스택 예제
    public static void main(String[] arg) throws Exception{
        Stack<Integer> st = new Stack<Integer>();
        st.push(5);
        st.push(2);
        st.push(3);
        st.push(7);
        st.pop();
        st.push(1);
        st.push(4);
        st.pop();
        System.out.println(st);
        while(!st.empty()){
            System.out.printf("%d ",st.peek());
            st.pop();
        }
    }
}
