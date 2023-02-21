package score;

public class Score1 {
    public static void main(String[] args) {

        int no = 1;
        int korean = 90;
        int english = 80;
        int tot = korean + english;
        int avg = tot / 2;
        String point = "";
        int rank = 1;
        
        if(avg >= 90){
            point = "A";
        } else if (avg >= 80) {
            point = "B";
        } else if (avg >= 70) {
            point = "C";
        } else if (avg >= 60) {
            point = "D";
        }else if(avg >= 50){
            point = "E";
        }else point ="F";

        System.out.println("***********************성적표***********************");
        System.out.println("학번\t\t국어\t\t영어\t\t총점\t\t평균\t\t학점\t\t등수");
        System.out.println("--------------------------------------------------");
        System.out.println(no + "\t\t" + korean + "\t\t" + english + "\t\t" + tot + "\t\t" + avg + "\t\t" + point + "\t\t" + rank);
    }
}
