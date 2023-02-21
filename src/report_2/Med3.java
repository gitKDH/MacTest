package report_2;

import java.util.Scanner;

public class Med3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("정수 a :"); int a = value.nextInt();
        System.out.print("정수 b :"); int b = value.nextInt();
        System.out.print("정수 c :"); int c = value.nextInt();

        int med;
        if (a>=b)
            if (b>=c)
                med = b;
            else if (a <= c)
                med = a;
            else
                med = c;
        else if (a > c)
            med = a;
        else if (b>c)
            med = c;
        else
            med = b;

        System.out.println("중앙값은"+med+"입니다");
    }
}
