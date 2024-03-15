import java.util.LinkedList;
import java.util.Queue;

public class Q5_1_2 {
    public static void main(String[] arg) throws Exception{
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll();
        q.offer(1);
        q.offer(4);
        q.poll();
        System.out.println(q);
    }
    
}
