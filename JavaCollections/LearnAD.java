package JavaCollections;

import java.util.ArrayDeque;

public class LearnAD {
    public static void main(String[] args) {


        ArrayDeque<Integer> ad= new ArrayDeque<>();



        ad.offer(2);
        ad.offerFirst(4);
        ad.offerLast(10);

        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());


//        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());

        System.out.println(ad);








    }
}
