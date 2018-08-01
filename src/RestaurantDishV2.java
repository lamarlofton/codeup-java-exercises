 class RestaurantDishV2 {

     private int costInCents;
     private String  nameOfDish;
     private boolean wouldRecommerivate;

     public int getCostInCents() {
         return costInCents;
     }

     public String getNameOfDish() {
         return nameOfDish;
     }

     public void setWouldRecommerivate(boolean wouldRecommerivate) {
         this.wouldRecommerivate = wouldRecommerivate;
     }



    public static void eat() {
        System.out.println("Nom nom nom!");

    }
}