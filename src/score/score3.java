package score;

public class score3 {
    public static void main(String[] args) {
        int[] no = {1, 2, 3};
        int[] korean = {74, 47, 84};
        int[] english = {57, 48, 87};
        int[] tot = new int[3];
        int[] avg = new int[3];
        String[] point = new String[3];
        int[] rank = new int[3];

        for (int num = 0; num < no.length; num++) {
            tot[num] = korean[num] + english[num];
            avg[num] = tot[num] / 2;
            if (avg[num] >= 90) {
                point[num] = "A";
            } else if (avg[num] >= 80) {
                point[num] = "B";
            } else if (avg[num] >= 70) {
                point[num] = "C";
            } else if (avg[num] >= 60) {
                point[num] = "D";
            } else if (avg[num] >= 50) {
                point[num] = "E";
            } else {
                point[num] = "F";
            }
            rank[num] = 1;
        }

        System.out.println("***********************성적표***********************");
        System.out.println("학번\t\t국어\t\t영어\t\t총점\t\t평균\t\t학점\t\t등수");
        System.out.println("--------------------------------------------------");
        for (int num = 0; num < no.length; num++) {
            System.out.println(no[num] + "\t\t" + korean[num] + "\t\t" + english[num] + "\t\t" + tot[num] + "\t\t" + avg[num] + "\t\t" + point[num] + "\t\t" + rank[num]);
        }
        for (int row = 0; row < no.length - 1; row++) {
            for (int col = row + 1; col < no.length; col++) {
                if (avg[row] < avg[col]) {
                    int temp = no[row];
                    no[row] = no[col];
                    no[col] = temp;

                    temp = korean[row];
                    korean[row] = korean[col];
                    korean[col] = temp;

                    temp = english[row];
                    english[row] = english[col];
                    english[col] = temp;

                    temp = tot[row];
                    tot[row] = tot[col];
                    tot[col] = temp;

                    temp = avg[row];
                    avg[row] = avg[col];
                    avg[col] = temp;

                    String temp2 = point[row];
                    point[row] = point[col];
                    point[col] = temp2;

                }
            }
        }
        for (int row = 0; row < no.length - 1; row++) {
            for (int col = row + 1; col < no.length; col++) {
                if (avg[row] < avg[col]) {
                    rank[row] = rank[row] + 1;
                } else if (avg[row] > avg[col]) {
                    rank[col] = rank[col] + 1;
                }
            }
        }
        System.out.println("******************정렬 후 성적표*********************");
        System.out.println("학번\t\t국어\t\t영어\t\t총점\t\t평균\t\t학점\t\t등수");
        System.out.println("--------------------------------------------------");
        for (int num = 0; num < no.length; num++) {
            System.out.println(no[num] + "\t\t" + korean[num] + "\t\t" + english[num] + "\t\t" + tot[num] + "\t\t" + avg[num] + "\t\t" + point[num] + "\t\t" + rank[num]);
        }
    }
}
