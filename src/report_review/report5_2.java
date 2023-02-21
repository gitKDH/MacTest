package report_review;

import java.util.Scanner;

public class report5_2 {
    public static void main(String[] args) {
        //달을 정숫값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램.
        //원하는 만큼 압력 및 출력 할 수 있게 하며, 1~12 이외의 값이 입력된 경우에는
        //재입력 하도록 할 것 (do문 안에 do문이 들어가는 이중 루프가 된다.)
        Scanner value = new Scanner(System.in);
        int retry;

        do{
            int month;
            do{
                System.out.println("월을 입력하세요 : ");
                month = value.nextInt();
            }while(month < 1 || month > 12);
            if(month == 3 || month == 4 || month == 5)
                System.out.println("봄입니다");
            else if (month == 6 || month ==7 || month == 8) {
                System.out.println("여름입니다");
            } else if (month == 9 || month == 10 || month == 11) {
                System.out.println("가을입니다");
            } else if (month == 12 || month == 1 || month == 2) {
                System.out.println("겨울입니다");
            }

            System.out.println("다시 하겠습니까? 1. 다시 0. 끝.");
            retry = value.nextInt();
        }while(retry == 1);
    }
}
