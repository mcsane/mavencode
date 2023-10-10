package task7_4.dao;
import jakarta.persistence.EntityManager;
import task7_4.entity.*;
public class TransactionDao {
    public void persist(Transaction transaction) {
        EntityManager em = task7_4.datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();
    }
    public Transaction find(int id) {
        EntityManager em = task7_4.datasource.MariaDbJpaConnection.getInstance();
        return em.find(Transaction.class, id);
    }

}
