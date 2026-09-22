import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <=5; i++){
            q.offer(i); //offer() method can be use to add elements.
        }
        //System.out.println("Elements: " + q);
        System.out.println("Queue is: ");
        while(!q.isEmpty()){
            System.out.println(q.poll()); //poll() delete and returns first element of the queue.
        }
    }
}
