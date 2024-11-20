package pe.edu.i202222759.entity;

import jakarta.persistence.*;

@Entity
@IdClass(CountryLanguageId.class)
public class countrylanguage {

    @Id
    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private country CountryCode;

    @Id
    private String Language;
    private String IsOfficial;
    private int Percentage;


    public countrylanguage() {
    }

    public countrylanguage(country countryCode) {
        CountryCode = countryCode;
    }

    public countrylanguage(country countryCode, String language, String isOfficial, int percentage) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public int getPercentage() {
        return Percentage;
    }

    public void setPercentage(int percentage) {
        Percentage = percentage;
    }

    public country getCountry() {
        return CountryCode;
    }

    public void setCountry(country country) {
        CountryCode = country;
    }

    @Override
    public String toString() {
        return "countrylanguage{" +
                "CountryCode=" + CountryCode +
                ", Language='" + Language + '\'' +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                '}';
    }
}
