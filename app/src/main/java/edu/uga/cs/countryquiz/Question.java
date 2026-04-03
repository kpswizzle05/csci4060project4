package edu.uga.cs.countryquiz;

import java.util.ArrayList;

public class Question {
    private final Country country;
    private final ArrayList<String> options;
    private int selectedCapital;

    public Question(Country country, ArrayList<String> options) {
        this.country = country;
        this.options = options;
        this.selectedCapital = -1;
    }

    public Country getCountry() {
        return country;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public int getSelectedCapital() {
        return selectedCapital;
    }

    public void setSelectedCapital(int selectedCapital) {
        this.selectedCapital = selectedCapital;
    }

    public boolean isAnswered() {
        return selectedCapital != -1;
    }

    public int getScore() {
        if (selectedCapital < 0 || selectedCapital >= options.size()) {
            return 0;
        }
        return options.get(selectedCapital).equals(country.getCapital()) ? 1 : 0;
    }
}
