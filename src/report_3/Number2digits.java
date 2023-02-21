package report_3;

import java.util.Random;
import java.util.Scanner;

public class Number2digits {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner value = new Scanner(System.in);
        int no = 10 + rand.nextInt(90); // 맞춰야하는 랜덤의 난수를 생성. 10~99까지의 범위
        System.out.println("숫자 맞추기 게임 시작");
        System.out.println("10부터 99사이의 숫자를 맞추세요.");
        int x;
        do{
            System.out.println("숫자를 유추해보세요 : ");
            x = value.nextInt();

            if (x > no)
                System.out.println("더 작은 숫자입니다.");
            else if (x < no)
                System.out.println("더 큰 숫자입니다.");
            //정답이 아니면 이 if문을 반복함
        }while (x != no); // 이 구문이 참이면 다시 do구문 실행
        System.out.println("정답입니다.");

    }
}
