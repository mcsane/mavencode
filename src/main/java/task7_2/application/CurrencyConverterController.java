package task7_2.application;

import task7_2.dao.CurrencyDao;
import task7_2.entity.CurrencyConverter;
import task7_2.view.CurrencyConverterView;

public class CurrencyConverterController {


    private CurrencyDao dao = new CurrencyDao();
    private CurrencyConverter converter = new CurrencyConverter();
    private CurrencyConverterView gui;
    public CurrencyConverterController(CurrencyConverterView gui){
        this.gui = gui;
    }
    public void convert(){
        double amount = Double.parseDouble(gui.getAmount());
        String from = gui.getFrom();
        String to = gui.getTo();
        double rateFrom = dao.getRate(from);
        double rateTo = dao.getRate(to);
        double result = converter.convert(amount, rateFrom, rateTo);
        gui.setResult(result);

    }

    public static void main(String[] args) {
        CurrencyConverterView.launch(CurrencyConverterView.class);
    }


}
