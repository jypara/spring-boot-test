package hello.world.repository;

import java.lang.Exception;
import hello.world.entity.CountryLanguage;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import java.util.*;


@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {

    CountryLanguage findOneByCountryCode(String countryCode);

}
