package basicquest;

import java.util.Scanner;

public class Palind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = -121;
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;

        }
        if(originalNumber==reversedNumber){
            System.out.println(reversedNumber);
        }
    }
}
