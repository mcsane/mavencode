package task7_3.dao;



import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import task7_3.entity.CurrencyConverter;


public class CurrencyDao {
    public void persist(CurrencyConverter currencyConverter) {
        EntityManager em = task7_3.datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currencyConverter);
        em.getTransaction().commit();
    }

    public CurrencyConverter find(String currency) {
        EntityManager em = task7_3.datasource.MariaDbJpaConnection.getInstance();
        TypedQuery<CurrencyConverter> query = em.createQuery("SELECT c FROM CurrencyConverter c WHERE c.currency = :currency", CurrencyConverter.class);
        query.setParameter("currency", currency);
        return query.getSingleResult();
    }
}
