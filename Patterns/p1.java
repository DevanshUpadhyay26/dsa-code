package Patterns;

public class p1 {


    static void Pattern1(int N) {
        int i, j;

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//* * *
//* * *
//* * *
    static  void Pattern2(int n){

        for(int i=0; i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *
//* * * * * * *
//* * * * * * * *
    static  void Pattern3(int n){
        for(int i=1; i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
// 1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7
    static  void Pattern4(int n){
    for(int i=1; i<n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
//                1
//                2 2
//                3 3 3
//                4 4 4 4
//                5 5 5 5 5
//                6 6 6 6 6 6
//                7 7 7 7 7 7 7



    static void Pattern5(int n){

        for(int i =0;i <n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//* * * * *
//* * * *
//* * *
//* *
//*
    static void Pattern6(int n){

    for(int i =0;i < n;i++){
        for(int j=n;j>i;j--){
            System.out.print(n-j+1 + " ");
        }
        System.out.println();
    }
}
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

    public static void main(String[] args) {
    int N=5;
    Pattern4(N);

    }
}

