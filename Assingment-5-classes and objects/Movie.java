public class Movie {
    String movieName;
    String director;
    String actor;
    String actress;
    String musicDirector;
    int numberOfArtists;
    int releaseYear;
    String producer;
    boolean isBlockBuster;
    public Movie(String movieName, String director, String actor, String actress, String musicDirector,
            int numberOfArtists, int releaseYear, String producer, boolean isBlockBuster) {
        this.movieName = movieName;
        this.director = director;
        this.actor = actor;
        this.actress = actress;
        this.musicDirector = musicDirector;
        this.numberOfArtists = numberOfArtists;
        this.releaseYear = releaseYear;
        this.producer = producer;
        this.isBlockBuster = isBlockBuster;
    }
    public String getMovieName() {
        return "The movie name is: " + movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getDirector() {
        return "The director name is: " +  director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActor() {
        return "The actor name is: " +actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getActress() {
        return "The actress name is: " + actress;
    }
    public void setActress(String actress) {
        this.actress = actress;
    }
    public String getMusicDirector() {
        return "The musicDirector name is: " + musicDirector;
    }
    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
    public String getNumberOfArtists() {
        return  "The numberOfArtists is: " + numberOfArtists;
    }
    public void setNumberOfArtists(int numberOfArtists) {
        this.numberOfArtists = numberOfArtists;
    }
    public String getReleaseYear() {
        return  "The movie got released on: " +releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getProducer() {
        return "The Producer name is: " + producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String isBlockBuster() {
        return isBlockBuster? "The movie is  a block Buster": "The movie is a flopp!!";
    }
    public void setBlockBuster(boolean isBlockBuster) {
        this.isBlockBuster = isBlockBuster;
    }
}
