package pe.edu.i202222759.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;


@Entity
public class country {

    @Id
    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private int SurfaceArea;
    private int IndepYear;
    private int Population;
    private int LifeExpectancy;
    private int GNP;
    private int GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private int Capital;
    private String Code2;

    @OneToMany (mappedBy = "CountryCode",cascade = CascadeType.PERSIST)
    private List<city> cities;

    @OneToMany (mappedBy = "CountryCode",cascade = CascadeType.PERSIST)
    private List<countrylanguage> countrylanguages;

    public country() {
    }

    public country(String code) {
        Code = code;
    }

    public country(String code, String name, String continent, String region, int surfaceArea, int indepYear, int population, int lifeExpectancy, int GNP, int GNPOld, String localName, String governmentForm, String headOfState, int capital, String code2, List<city> cities, List<countrylanguage> countrylanguages) {
        Code = code;
        Name = name;
        Continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
        this.cities = cities;
        this.countrylanguages = countrylanguages;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public int getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(int surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public int getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(int indepYear) {
        IndepYear = indepYear;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public int getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public int getGNP() {
        return GNP;
    }

    public void setGNP(int GNP) {
        this.GNP = GNP;
    }

    public int getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(int GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public int getCapital() {
        return Capital;
    }

    public void setCapital(int capital) {
        Capital = capital;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String code2) {
        Code2 = code2;
    }

    public List<city> getCities() {
        return cities;
    }

    public void setCities(List<city> cities) {
        this.cities = cities;
    }

    public List<countrylanguage> getCountrylanguages() {
        return countrylanguages;
    }

    public void setCountrylanguages(List<countrylanguage> countrylanguages) {
        this.countrylanguages = countrylanguages;
    }

    @Override
    public String toString() {
        return "country{" +
                "Code=" + Code +
                ", Name='" + Name + '\'' +
                ", Continent='" + Continent + '\'' +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", LocalName='" + LocalName + '\'' +
                ", GovernmentForm='" + GovernmentForm + '\'' +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Capital=" + Capital +
                ", Code2=" + Code2 +
                '}';
    }
}
