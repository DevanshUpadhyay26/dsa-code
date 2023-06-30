package basicquest;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int prev=0;
        int curr=1;

        int count=2;


        while (count<=num){
        int temp=curr;
        curr=curr+prev;
        prev=temp;
        count++;
        }
        System.out.println(curr);
    }
}
