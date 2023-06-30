package JavaCollections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPQ {
    public static void main(String[] args) {


        Queue<Integer> pr = new PriorityQueue<>(Comparator.reverseOrder());
//        PriorityQueue<Integer> pr = new PriorityQueue<>();


        pr.add(30);
        pr.add(10);
        pr.add(12);
        pr.add(19);
        pr.add(15);




        System.out.println(pr);
    }
}
