package task7_3.datasource;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class MariaDbJpaConnection {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getInstance(){
        if(emf == null) {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("MariaDbJpaConnection");
            }
            em = emf.createEntityManager();
        }
        return em;
    }
}
