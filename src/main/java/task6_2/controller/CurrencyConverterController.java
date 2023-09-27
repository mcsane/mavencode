package task6_2.controller;

import task6_2.model.CurrencyConverter;
import task6_2.view.CurrencyConverterView;

public class CurrencyConverterController {
    private CurrencyConverter converter = new CurrencyConverter();
    private CurrencyConverterView gui;
    public CurrencyConverterController(CurrencyConverterView gui){
        this.gui = gui;
        converter.addRates("USD", 1.0);
        converter.addRates("EUR", 0.95);
        converter.addRates("GBP", 0.82);
    }
    public void convert(){
        double amount = Double.parseDouble(gui.getAmount());
        String from = gui.getFrom();
        String to = gui.getTo();
        double result = converter.convert(amount, from, to);
        gui.setResult(result);
    }

    public static void main(String[] args) {
        CurrencyConverterView.launch(CurrencyConverterView.class);
    }


}
