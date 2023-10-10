package task7_4.application;

import task7_4.dao.*;
import task7_4.entity.*;
import task7_4.view.CurrencyConverterView;

public class CurrencyConverterController {


    private CurrencyDao dao = new CurrencyDao();
    private TransactionDao tDao = new TransactionDao();
    private CurrencyConverter1 converter;
    private CurrencyConverterView gui;
    public CurrencyConverterController(CurrencyConverterView gui){
        this.converter = new CurrencyConverter1();
        this.gui = gui;
    }
    public void convert(){
        double amount = Double.parseDouble(gui.getAmount());
        String from = gui.getFrom();
        String to = gui.getTo();
        CurrencyConverter1 rateFrom = dao.find(from);
        CurrencyConverter1 rateTo = dao.find(to);
        double result = converter.convert(amount, rateFrom.getRate(), rateTo.getRate());
        gui.setResult(result);
        tDao.persist(new Transaction(amount, rateFrom, rateTo));
    }
    public void addCurren(String currency, double rate){
        CurrencyConverter1 currencyConverter = new CurrencyConverter1(currency, rate);
        dao.persist(currencyConverter);
        gui.addChoice(currency);
    }
    public void add(String currency, String rate){
        CurrencyConverter1 currencyConverter = new CurrencyConverter1(currency, Double.parseDouble(rate));
        dao.persist(currencyConverter);
        gui.addChoice(currency);
    }


    public static void main(String[] args) {
        CurrencyConverterView.launch(CurrencyConverterView.class);
    }


}
