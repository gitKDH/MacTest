package report_2;

import java.util.Scanner;

public class Sort2Descending {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("정수 a : "); int a = value.nextInt();
        System.out.print("정수 b : "); int b = value.nextInt();

        if (a < b){
            int t = a;
            a = b;
            b = t;
            System.out.println("a>=b가 되도록 정렬했습니다");
        }

        System.out.println("변수 a" + a + "입니다");
        System.out.println("변수 b" + b + "입니다");
    }
}
