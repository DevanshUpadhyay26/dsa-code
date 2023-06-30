package basicquest;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no1,no2,no3;
        no1=sc.nextInt();
        no2=sc.nextInt();
        no3=sc.nextInt();
        System.out.println("Largest No is :"+Largest(no1,no2,no3));
        System.out.println("Smallest No is :"+Smallest(no1,no2,no3));
    }
    static int Largest(int a,int b,int c){
//    int maxVal=a;
//    if(maxVal<b)
//        maxVal=b;
//    if(maxVal<c)
//         maxVal=c;
//    return maxVal;

        return Math.max(a,Math.max(b,c));
    }
    static int Smallest(int a, int b, int c){
//    int minVal=a;
//    if(minVal>b)
//        minVal=b;
//    if(minVal>c)
//        minVal=c;
//    return minVal;
        return Math.min(a,Math.min(b,c));
    }
}


