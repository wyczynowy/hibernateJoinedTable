package pl.dawidkozub.hibernateJoinedTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinedTableDAOTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AnimalsDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Pet newPet = new Pet();
        newPet.setName("Hellboy");
        newPet.setSpecies("Bulldog");

        entityManager.persist(newPet);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}