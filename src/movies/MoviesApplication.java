package movies;

import util.Input;

    public class MoviesApplication {

        public static Movie[] movies = MoviesArray.findAll();
        public static Input userInput = new Input();

        public static void movieApp() {
            System.out.println("What would you like to do?\n" +
                    "\n" + " 0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");

            int userChoice = userInput.getInt();

            if (userChoice == 0) {
                System.out.println("Thanks For Using The Movie App");
            }
            if (userChoice == 1) {
                for (Movie movie : movies) {
                    System.out.println(movie.getName() + "-" + movie.getCategory());
                }
            }

            if (userChoice == 2) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getName() + "-" + movie.getCategory());
                    }

                }
            }

                if (userChoice == 3) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("drama")) {
                            System.out.println(movie.getName() + "-" + movie.getCategory());
                        }
                    }
                }

                    if (userChoice == 4) {
                        for (Movie movie : movies) {
                            if (movie.getCategory().equalsIgnoreCase("horror")) {
                                System.out.println(movie.getName() + "-" + movie.getCategory());
                            }
                        }
                    }

                        if (userChoice == 5) {
                            for (Movie movie : movies) {
                                if (movie.getCategory().equalsIgnoreCase("scifi")) {
                                    System.out.println(movie.getName() + "-" + movie.getCategory());
                                }
                            }
                        }
                if (userInput.yesNo("\nWould You Like To Cont...? [y/n]")){
                    movieApp();
                }else
                    System.out.println("Thanks For Visiting Lofton Movies App!!!");
                    }

                            public static void main (String[]args){
                                movieApp();
                            }
        }
















