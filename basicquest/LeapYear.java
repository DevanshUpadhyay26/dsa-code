package basicquest;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Year=sc.nextInt();
        if(Year%4==0) System.out.println("Leap Year");
        else System.out.println("Not Leap Yaer");
    }
}
/*
The year must be divisible by 4
 */