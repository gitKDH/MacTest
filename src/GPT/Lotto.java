package GPT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        ArrayList<Integer> selectedNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            selectedNumbers.add(numbers.get(i));
        }
        Collections.sort(selectedNumbers);

        System.out.println("Selected numbers:");
        for (int number : selectedNumbers) {
            System.out.println(number);
        }
    }
}
