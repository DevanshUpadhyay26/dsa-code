package JavaCollections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue); //[1, 2, 3, 4]
        System.out.println(queue.poll()); //1
        System.out.println(queue); // [2, 3, 4]
        System.out.println(queue.peek()); //2
        System.out.println(queue.element()); //2
        System.out.println(queue.remove()); //2 remove
        System.out.println(queue); //[3, 4]
    }
}
