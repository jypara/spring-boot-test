package hello.world.entity;
import javax.persistence.*;
import hello.world.entity.CountryLanguage;
import java.io.Serializable;

@Entity
@Table(name="country")
public class Country implements Serializable{
    @Id
    @Column(name="code", length=3, nullable=false)
    private String code;

    @Column(name="name", length=256, nullable=false)
    private String name;

    @Column(name="continent", length=256, nullable=false)
    private String continent;

    @Column(name="region", length=256, nullable=false)
    private String region;

    @Column(name="surface_area", nullable=false)
    private double surface_area;

    @Column(name="indep_year")
    private Integer indep_year;

    @Column(name="population", nullable=false)
    private int population;

    @Column(name="life_expectancy")
    private Double life_expectancy;

    @Column(name="gnp")
    private Double gnp;

    @Column(name="gnp_old", nullable=true)
    private Double gnp_old;

    @Column(name="local_name", length=256, nullable=false)
    private String local_name;

    @Column(name="government_form", length=256, nullable=false)
    private String government_form;

    @Column(name="head_of_state", length=256)
    private String head_of_state;

    @Column(name="capital")
    private Integer capital;

    @Column(name="code2", length=2)
    private String code2;

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSurface_area() {
        return surface_area;
    }

    public void setSurface_area(double surface_area) {
        this.surface_area = surface_area;
    }

    public Integer getIndep_year() {
        return indep_year;
    }

    public void setIndep_year(Integer indep_year) {
        this.indep_year = indep_year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Double getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(Double life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public Double getGnp() {
        return gnp;
    }

    public void setGnp(Double gnp) {
        this.gnp = gnp;
    }

    public Double getGnp_old() {
        return gnp_old;
    }

    public void setGnp_old(Double gnp_old) {
        this.gnp_old = gnp_old;
    }

    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name = local_name;
    }

    public String getGovernment_form() {
        return government_form;
    }

    public void setGovernment_form(String government_form) {
        this.government_form = government_form;
    }

    public String getHead_of_state() {
        return head_of_state;
    }

    public void setHead_of_state(String head_of_state) {
        this.head_of_state = head_of_state;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
}
