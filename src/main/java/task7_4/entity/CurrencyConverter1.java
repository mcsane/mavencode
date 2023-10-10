package task7_4.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currencies")
public class CurrencyConverter1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "currency")

    private String currency;
    @Column(name = "rate")
    private double rate;


    public CurrencyConverter1(String currency, double rate) {
        this.currency = currency;
        this.rate = rate;
    }

    public CurrencyConverter1() {
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
    public int getId() {
        return id;
    }

}
