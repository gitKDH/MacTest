package report_1;

import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수값 :");
        int n = stdIn.nextInt();

        // if-then문 : if (조건식) 실행문
        if (n<0)
            System.out.println("이 값은 음수다");
    }
}
