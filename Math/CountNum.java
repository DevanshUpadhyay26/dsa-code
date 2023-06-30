package Math;

public class CountNum {
    static  int digitCount(int num){

//takes tc= o(n) and sc=o(1)
//        int temp=num;
//        int counter=0;
//
//        while (temp!=0){
//            temp /=10;
//            counter++;
//        }
//        return counter;

//        Tc=0(1) and sc=o(1)
        String str=Integer.toString(num);
        return str.length();
    }
    public static void main(String[] args) {
        int a=5198165;
        System.out.println(digitCount(a));
    }
}
/*
* Example 1:
Input: N = 12345
Output: 5
Explanation: N has 5 digits
* */


