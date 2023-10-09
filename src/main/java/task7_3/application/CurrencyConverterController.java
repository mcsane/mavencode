package task7_3.application;

import task7_3.dao.CurrencyDao;
import task7_3.entity.CurrencyConverter;
import task7_3.view.CurrencyConverterView;

public class CurrencyConverterController {


    private CurrencyDao dao = new CurrencyDao();
    private CurrencyConverter converter;
    private CurrencyConverterView gui;
    public CurrencyConverterController(CurrencyConverterView gui){
        this.converter = new CurrencyConverter();
        this.gui = gui;
    }
    public void convert(){
        double amount = Double.parseDouble(gui.getAmount());
        String from = gui.getFrom();
        String to = gui.getTo();
        CurrencyConverter rateFrom = dao.find(from);
        CurrencyConverter rateTo = dao.find(to);
        double result = converter.convert(amount, rateFrom.getRate(), rateTo.getRate());
        gui.setResult(result);
    }
    public void add(String currency, String rate){
        CurrencyConverter currencyConverter = new CurrencyConverter(currency, Double.parseDouble(rate));
        dao.persist(currencyConverter);
        gui.addChoice(currency);
    }


    public static void main(String[] args) {
        CurrencyConverterView.launch(CurrencyConverterView.class);
    }


}
