package report_6;

import java.util.Scanner;

public class OctHex {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("정수 :");
        int x = value.nextInt();

        System.out.printf("8진수는 %o입니다.\n", x);
        System.out.printf("16진수는 %x입니다.\n", x);
    }
}
