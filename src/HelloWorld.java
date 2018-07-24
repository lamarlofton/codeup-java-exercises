public class HelloWorld {
    public static void main(String[] args) {

        int myFavoriteNumber;
        myFavoriteNumber = 5;

        String myString;
        myString = "My Favorite number is";

        String s = "" + 's';

//        long 3.14159 = ""  + "3.14159";

        float myNumber;
        myNumber = 3.14f;
//        myNumber = (float)3.14;

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);


        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        ++x increments the value of x and then returns x
//        x++ returns the value of x and then increments

//        int class

        int a = 4;
        a += 5;
        System.out.println(a);


        int j = 3;
        int p = 4;
        p *= j;


        int r = 10;
        int t = 2;
        r /= t;
        t -= r;

        System.out.println("My favorite number is " + myFavoriteNumber);
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println(myString + " " + myFavoriteNumber);
        System.out.println(s);
        System.out.println(myNumber);
    }
}
