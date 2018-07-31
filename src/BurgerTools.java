public class BurgerTools {

    public String mostPopularTopping;
    public int averageDayBeforeExpiration;
    public int temperatureWhenCooked;

    public BurgerTools(String mostPopularTopping){
        this.mostPopularTopping = mostPopularTopping;
    }

    public static void grill() {
        System.out.println("Grilling Burgers!!!");
    }

}
