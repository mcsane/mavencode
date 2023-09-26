package task6_2.model;

import java.util.HashMap;

public class CurrencyConverter {

    private HashMap<String, Double> rates;

    public void addRates(String currency, Double rate){
        rates.put(currency,rate);
    }
    public double convert(double amount, String from, String to){
        double og = rates.get(from);
        double target = rates.get(to);
        return amount * (target/og);
    }

}
