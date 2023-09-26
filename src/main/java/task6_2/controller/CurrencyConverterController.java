package task6_2.controller;

import task6_2.model.CurrencyConverter;
import task6_2.view.CurrencyConverterView;

public class CurrencyConverterController {
    private CurrencyConverter converter;
    private CurrencyConverterView gui;
    public CurrencyConverterController(CurrencyConverterView gui, CurrencyConverter converter){
        this.converter = converter;
        this.gui = gui;
        converter.addRates("USD", 1.0);
        converter.addRates("EUR", 0.95);
        converter.addRates("GBP", 0.82);
    }


}
