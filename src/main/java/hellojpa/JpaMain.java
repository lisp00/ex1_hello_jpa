package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Member a = em.find(Member.class, 101L);
            Member b = em.find(Member.class, 1L);

//            a.setName("HelloJPA");

            System.out.println(a);
            System.out.println(b);

//            System.out.println(a.getName() == (b.getName()));
            System.out.println("---" + a.getName());

//            em.remove(b);

//            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
