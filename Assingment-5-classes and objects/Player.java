public class Player {
    private String name;
    private String position;
    private int jerseyNumber;
    private Team team;

    public Player(String name, String position, int jerseyNumber, Team team) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void playGame() {
        System.out.println(name + " (#" + jerseyNumber + ") is playing a game as a " + position + " for " + team.getName());
    }

    public void train() {
        System.out.println(name + " is training hard!");
    }
}
