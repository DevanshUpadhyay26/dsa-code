package basicquest;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int count=2;
    if (count<num)
        if(num%count==0)
            System.out.println("Not prime");
        else
            System.out.println("Prime");

    }
}
