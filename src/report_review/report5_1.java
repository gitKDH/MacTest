package report_review;

import java.util.Scanner;

public class report5_1 {
    public static void main(String[] args) {
        //1부터 n까지의 정숫값에 각 값을 제곱해서 표시하는 프로그램을 작성하라 (n값을 입력받을 것)
        Scanner value = new Scanner(System.in);
        System.out.println("n값을 입력하시오 : ");
        int n = value.nextInt();

        for(int i = 1; i <= n; i++)
            System.out.println(i+"의 제곱은 " + i * i);
    }
}
