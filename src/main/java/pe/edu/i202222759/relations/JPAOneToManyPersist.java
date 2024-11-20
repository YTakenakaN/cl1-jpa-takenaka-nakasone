package pe.edu.i202222759.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202222759.entity.*;

import java.util.Arrays;

public class JPAOneToManyPersist {
    public static void main(String[] args) {

        //referenciar al EMF y el EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        //crear country
        country Country = new country("AAA", "PaisA","South America","South America",1825,1992,75000,88,6485,4444,"LePais","Contitutional","Jorge Perez",582,"AA",null,null);

        //crear cities
        city City01 = new city(0,"CiudadA","DistritoA",5845,Country);
        city City02 = new city(0,"CiudadB","DistritoB",8547,Country);
        city City03 = new city(0,"CiudadC","DistritoC",9658,Country);

        Country.setCities(Arrays.asList(City01,City02,City03));

        //crear languages
        countrylanguage CountryLanguage01 = new countrylanguage(Country,"Espanol","T",60);
        countrylanguage CountryLanguage02 = new countrylanguage(Country,"Ingles","T",40);

        Country.setCountrylanguages(Arrays.asList(CountryLanguage01,CountryLanguage02));

        //persist
        em.getTransaction().begin();
        em.persist(Country);
        em.getTransaction().commit();

    }
}
