package JavaCollections;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> ani=new Stack<>();
        ani.push("Lion");
        ani.push("Tiger");
        ani.push("Horse");
        ani.push("Cat");
        ani.push("Dog");
        System.out.println(ani);


        System.out.println(ani.peek());  //Dog

        ani.pop();
        System.out.println(ani.peek());  //Cat




    }

}
