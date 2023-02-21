package report_8;

import java.util.Scanner;

public class LinearSearchTop {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int n = value.nextInt();
        int[] a = new int[n];

        for (int j = 0; j < n; j++){
            System.out.print("a[" + j + "] = ");
            a[j] = value.nextInt();
        }

        System.out.print("찾을 숫자 : ");
        int key = value.nextInt();

        int i;
        for (i = 0; i < n; i++)
            if (a[i] == key)
                break;

        if(i<n)
            System.out.println("그 값은 a[" + i + "]에 있습니다");
        else
            System.out.println("해당 값이 존재하지 않습니다.");
    }
}
