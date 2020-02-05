package hello.world.entity;
import javax.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.*;

@Embeddable
public class CountryLanguageId implements Serializable{

	@ColumnDefault("0")
	private int countryLanguageId;
}