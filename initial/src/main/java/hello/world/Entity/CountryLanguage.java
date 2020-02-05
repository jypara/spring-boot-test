package hello.world.entity;
import javax.persistence.*;
import hello.world.entity.Country;
import java.util.Set;
import java.util.HashSet;
import java.io.Serializable;


@Entity
@Table(name="country_language")
public class CountryLanguage implements Serializable{

    @EmbeddedId
    private CountryLanguageId countryLanguageId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="code")
    private String countryCode;

    @Column(name="language", length=256, nullable=false)
    private String language;

    @Column(name="is_official", length=256, nullable=false)
    private boolean official;

    @Column(name="percentage", length=256, nullable=false)
    private double percentage;

    public CountryLanguage() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean getOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}