package JavaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();



        set.add(12);
        set.add(14);
        set.add(16);
        set.add(18);
        set.add(20);
        set.add(22);


        set.remove(12);


        System.out.println(set.contains(22));

    }
}
