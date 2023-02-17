public class State {
    private String name;
    private String abbreviation;
    private String capital;

    public State(String name, String abbreviation, String capital) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Abbreviation: " + abbreviation + "\n" + "Capital: " + capital;
    }
}
