package task7_3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currencies")
public class CurrencyConverter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "currency")
    private String currency;
    @Column(name = "rate")
    private double rate;

    public CurrencyConverter(String currency, double rate){
        this.currency = currency;
        this.rate = rate;
    }

    public CurrencyConverter() {
    }


    public double convert(double amount, double from, double to){

        return amount * (to/from);
    }

    public String getCurrency() {
        return currency;
    }

    public double getRate() {
        return rate;
    }

}
