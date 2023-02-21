package report_2;

import java.util.Scanner;

public class Sort3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("정수 a :"); int a = value.nextInt();
        System.out.print("정수 b :"); int b = value.nextInt();
        System.out.print("정수 c :"); int c = value.nextInt();
        //a = 3 b = 2 c = 1
        if (a>b){
            int t = a; a = b; b = t; // t = 3 a = 2 b = 3 c = 1
        }
        if (b>c) {
            int t = b; b = c; c = t; // t = 3 b = 1 c = 3 a = 2
        }

        if (a>b){
            int t = a; a= b; b= t;
        }
        System.out.println("a<=b<=c가 되도록 정렬했습니다");
        System.out.println("변수 a는 " + a +"입니다");
        System.out.println("변수 b는 " + b +"입니다");
        System.out.println("변수 c는 " + c +"입니다");
    }
}
