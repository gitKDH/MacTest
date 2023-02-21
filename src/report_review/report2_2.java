package report_review;

import java.util.Scanner;

public class report2_2 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("첫번째 정수는 :");
        int a = value.nextInt();
        System.out.print("두번째 정수는 :");
        int b = value.nextInt();

        if (a == b)
            System.out.println("두 값은 같습니다");

        if (a > b) {
            int t = a - b;
            System.out.println("두 값의 차는 :"+ t +"입니다");
        }
        else {
            int t = b - a;
            System.out.println("두 값의 차는 :"+ t +"입니다");
        }
    }
}
