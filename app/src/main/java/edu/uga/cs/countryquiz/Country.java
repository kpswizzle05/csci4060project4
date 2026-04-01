package edu.uga.cs.countryquiz;

public class Country {
    private int id;
    private String name;
    private String capital;
    private String continent;

    private Country(int id, String name, String capital, String continent) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getContinent() {
        return continent;
    }
}
