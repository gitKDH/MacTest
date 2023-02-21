package report_5;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("정방형을 표시합니다.");
        System.out.println("단수는 : ");
        int n = value.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j=1; j <= n; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
