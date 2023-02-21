package report_2;

import java.util.Scanner;

public class MinMaxEq {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("정수 a :");
        int a = value.nextInt();
        System.out.print("정수 b :");
        int b = value.nextInt();

        if (a == b)
            System.out.println("두 값이 같다");
        else {
            int min, max;
            if (a < b) {
                min = a;
                max = b;
            } else {
                min = b;
                max = a;
            }
            System.out.println("작은 값은 " + min +"입니다");
            System.out.println("큰 값은 " + max +"입니다");
        }
    }
}
