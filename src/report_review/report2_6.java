package report_review;

import java.util.Scanner;

public class report2_6 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("첫번째 정수는 :"); int a = value.nextInt();
        System.out.print("두번째 정수는 :"); int b = value.nextInt();

        int t;
        if(a==b){
            System.out.println("두 값은 같습니디");
        } else if (a>b) {
            System.out.println("큰 값은 "+a+"이고 다음 값은"+b+"입니다");
        }else {
            System.out.println("큰 값은 "+b+"이고 다음 값은"+a+"입니다");
        }
    }
}
