package hello.world.repository;

import java.lang.Exception;
import hello.world.entity.Country;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import java.util.*;


@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    Country findOneByCode(String code);

}