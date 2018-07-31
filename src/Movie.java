public class Movie {
    public String title;
    public String genre;
    public int releaseYear;
    public int starRating;
    public void getMovieInfo(){
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Release: " + releaseYear);
        System.out.println("Rating: " + starRating);
    }

    public Movie(String title, String genre, int releaseYear, int starRating){
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.starRating = starRating;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getReleaseYear(){
        return releaseYear;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setTitle(String title){
        this.title =title;
    }

    public static void main(String[] args) {
        Movie deadpool = new Movie("Deadpool", "Action", 2016, 4);
        System.out.println(deadpool.getTitle());
        deadpool.setTitle("Deadpool2");
        System.out.println(deadpool.getTitle());
        deadpool.getMovieInfo();
    }
}


