package task7_2.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class NumberOperation {
    public static void main(String[] args) {


        List<Integer> lista = Arrays.asList(10, 5, 8, 20, 15, 3, 12);

        Predicate<Integer> isEven = x -> x % 2 == 0;


        List<Integer> lista2 = new ArrayList<>();
        for (Integer number : lista) {
            if (!isEven.test(number)) {
                lista2.add(number);
            }
        }
        System.out.println(lista2);
        lista2.replaceAll(x -> x * 2);
        System.out.println(lista2);
        int sum = lista2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
