package hello.world.entity;
import javax.persistence.*;


@Entity
@Table(name="city")
public class City {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
        
    @Column(name="name", length=256, nullable=false)
    private String name;

    @Column(name="country_code", length=3, nullable=false)
    private String country_code;

    @Column(name="district", length=256, nullable=false)
    private String district;

    @Column(name="population", nullable=false)
    private int  population;

    public City(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
}