package task7_4.dao;



import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import task7_4.entity.CurrencyConverter1;


public class CurrencyDao {
    public void persist(CurrencyConverter1 currencyConverter) {
        EntityManager em = task7_4.datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currencyConverter);
        em.getTransaction().commit();
    }

    public CurrencyConverter1 find(String currency) {
        EntityManager em = task7_4.datasource.MariaDbJpaConnection.getInstance();
        TypedQuery<CurrencyConverter1> query = em.createQuery("SELECT c FROM CurrencyConverter1 c WHERE c.currency = :currency", CurrencyConverter1.class);
        query.setParameter("currency", currency);
        return query.getSingleResult();
    }
}
