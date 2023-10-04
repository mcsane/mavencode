package task7_2.entity;

import java.util.HashMap;

public class CurrencyConverter {



    public double convert(double amount, double from, double to){

        return amount * (from/to);
    }

}
