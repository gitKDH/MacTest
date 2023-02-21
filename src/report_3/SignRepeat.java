package report_3;

import java.util.Scanner;

public class SignRepeat {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int retry;

        do{
            System.out.println("정수값 : ");
            int n = value.nextInt();

            if (n>0)
                System.out.println("이 값은 양수입니다.");
            else if(n<0)
                System.out.println("이 값은 음수입니다.");
            else
                System.out.println("이 값은 0 입니다.");

            System.out.println("다시 한 번? 1-Yes / 0-No :");
            retry = value.nextInt();
        }while (retry==1); // 이 조건이 true이면 다시 실행. 즉, 입력받은 값이 1이 충족되면 위 코드 다시 실행.

    }
}
