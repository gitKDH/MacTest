package report_6;

import java.util.Scanner;

public class OctHex1Line {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("정수 : ");
        int x = value.nextInt();

        System.out.printf("8진수는 %o이고 16진수는 %x입니다\n",x,x);
    }
}
