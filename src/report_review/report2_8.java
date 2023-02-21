package report_review;

import java.util.Scanner;

public class report2_8 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("첫번째 정수는 :"); int a = value.nextInt();
        System.out.print("두번째 정수는 :"); int b = value.nextInt();
        System.out.print("세번째 정수는 :"); int c = value.nextInt();

        if (a>b){
            int t = a; a = b; b = t;
        }
        if(b>c){
            int t = b; b = c; c = t;
        }
        if(a>b){
            int t = a; a = b; b = t;
        }
        System.out.println("내림차순으로"+a+b+c+"입니다");
    }
}
