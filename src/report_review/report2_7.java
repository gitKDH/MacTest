package report_review;

import java.util.Scanner;

public class report2_7 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("첫번째 정수는 :"); int a = value.nextInt();
        System.out.print("두번째 정수는 :"); int b = value.nextInt();

        int t;
        if (a>b){
            t = a; a = b;
        }else{
            t = b;
        }
        System.out.println("순서는" +t+"다음에"+a+"입니다");
    }
}
