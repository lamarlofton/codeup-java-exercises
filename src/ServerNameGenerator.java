public class ServerNameGenerator {
   public static String[] nouns = {"Castle", "CodeUp", "SixFlags", "Motorcycle", "Phone", "California", "Texas", "Jessica", "Sydnee", "Jaiden"};

   public static String[] adjectives = {"Huge", "Lovely", "Beautiful", "Fun", "Happy", "Sexy", "Pretty", "Insane", "Crazy", "Famous"};

    public static void serverName() {
        int randomNum = (int) Math.ceil(Math.random() * 1000);

        if (randomNum <= nouns.length || randomNum <= adjectives.length){ ;
        System.out.println("Here is your server name: \n" +
                adjectives[randomNum] + "-" + nouns[randomNum]);

        }else {
            serverName();
        }
    }

    public static void main(String[] args) {
        serverName();
    }
}
