package task8_2;

import java.util.Arrays;

public class MeanCalc {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        double mean = Arrays.stream(array).average().getAsDouble();
        System.out.println(mean);
    }
}
