package report_2;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("정수 a :"); int a = value.nextInt();
        System.out.print("정수 b :"); int b = value.nextInt();
        System.out.print("정수 c :"); int c = value.nextInt();

        int min = a;
        if (b< min) min = b;
        if (c< min) min = c;

        System.out.println("최솟값은" + min + "입니다");
    }
}
