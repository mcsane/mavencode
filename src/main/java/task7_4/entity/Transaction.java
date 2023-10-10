package task7_4.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private double amount;

        @ManyToOne

        private CurrencyConverter1 from;
        @ManyToOne

        private CurrencyConverter1 to;

        public Transaction(double amount, CurrencyConverter1 from, CurrencyConverter1 to) {
            this.amount = amount;
            this.from = from;
            this.to = to;
        }
        public Transaction() {
        }
}
