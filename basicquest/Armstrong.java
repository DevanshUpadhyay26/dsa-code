package basicquest;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(ArmStr(num));
    }
    public static boolean ArmStr(int num) {
    int sum=0;
        int ogNum=num;
        while (num>0){
            int rem=num%10;
            num/=10;
            sum=sum+rem*rem*rem;
        }
        return sum==ogNum;
    }
}
