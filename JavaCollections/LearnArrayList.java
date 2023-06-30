package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {


    public static void main(String[] args) {
//        Works on O(N) TC and SC
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list //[1, 2, 3, 4]
        );

//      1st Option
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        2nd Option
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        1
//        2
//        3
//        4

//        list.add(0,43); or u can use list.set
//        System.out.println(list); //[43, 1, 2, 3, 4]
//
//        list.remove(0);
//        System.out.println(list); //[1, 2, 3, 4]

//        System.out.println(list.get(2)); //3


//        List<Integer> Newlist= new ArrayList();
//        Newlist.add(100);
//        Newlist.add(200);
//        System.out.println(Newlist);
//        list.addAll(Newlist);
//        System.out.println(list); //[1, 2, 3, 4, 100, 200]





    }
}
