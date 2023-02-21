package report_review;

import java.util.Scanner;

public class report2_4 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("첫번째 정수는 :"); int a = value.nextInt();
        System.out.print("두번째 정수는 :"); int b = value.nextInt();
        System.out.print("세번째 정수는 :"); int c = value.nextInt();

        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        System.out.println("가장 작은 값은 : " + min);

    }
}
