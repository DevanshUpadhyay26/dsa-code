package basicquest;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fact(num));


    }
    static int fact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
