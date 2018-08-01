public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools burger =  new BurgerTools("Avacado");
        burger.averageDayBeforeExpiration = 3;
        burger.mostPopularTopping = "bacon";
        burger.temperatureWhenCooked = 145;
        burger.grill();
    }
}
