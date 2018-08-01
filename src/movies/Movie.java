package movies;
    public class Movie {

    private String name;
    private String category;
    private int rating;

    public Movie(String name, String category) {
        this.name = name;
        this. category = category;
    }

    public int getRating(){
        return rating;
    }
    public void setRating(int rating){
        this.rating = rating;

    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static Movie[] movieFinder = MoviesArray.findAll();
}