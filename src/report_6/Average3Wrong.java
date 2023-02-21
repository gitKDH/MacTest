package report_6;

import java.util.Scanner;

public class Average3Wrong {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("정숫값 x, y, z의 평균을 구합니다.");
        System.out.print("x값 : "); int x = value.nextInt();
        System.out.print("y값 : "); int y = value.nextInt();
        System.out.print("z값 : "); int z = value.nextInt();

        double ave = (x + y + z) / 3;
        System.out.printf("x,y,z의 평균은 %.3f입니다.\n", ave);
    }
}
