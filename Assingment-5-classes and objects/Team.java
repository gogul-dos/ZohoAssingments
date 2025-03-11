public class Team {
    private String name;
    private String city;
    private String division;

    public Team(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void playGame() {
        System.out.println(name + " is playing a game.");
    }

    public void hireCoach() {
        System.out.println("A new coach has been hired for " + name);
    }
}
