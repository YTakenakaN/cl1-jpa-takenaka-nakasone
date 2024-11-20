package pe.edu.i202222759.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class city {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Name;
    private String District;
    private int Population;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private country CountryCode;

    public city() {
    }

    public city(int ID) {
        this.ID = ID;
    }

    public city(int ID, String name, String district, int population, country countryCode) {
        this.ID = ID;
        Name = name;
        District = district;
        Population = population;
        CountryCode = countryCode;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public country getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(country countryCode) {
        CountryCode = countryCode;
    }

    @Override
    public String toString() {
        return "city{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                ", Country=" + CountryCode +
                '}';
    }
}
