package report_2;

import java.util.Scanner;

public class DiffDigits2 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("정수 a :"); int a = value.nextInt();
        System.out.print("정수 b :"); int b = value.nextInt();

        int diff = a >= b ? a-b : b-a;
        System.out.println("두 값의 차이는 "+ (diff <= 10 ? "10이하" : "11이상")+"입니다");
    }
}
