package task8_2;

import java.util.Arrays;
import java.util.List;

public class NumberOpe {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10, 5, 8, 20, 15, 3, 12);
        System.out.println(lista);
        int sum = lista.stream().
                filter(x -> x % 2 != 0).
                map(x -> x * 2).
                mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
