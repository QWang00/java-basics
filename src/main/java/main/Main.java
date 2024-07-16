package main;


public class Main {
    public static void main(String[] args) {
        String greet = "Hello QJ";
        System.out.println(greet);
        int birthYear = 1987;
        System.out.println(birthYear);
        double pi = 3.14;
        System.out.println(pi);
        boolean learnJava = true;
        System.out.println(learnJava);
        String favouriteFilm = "Titanic";
        System.out.println("My favourite film is " + favouriteFilm);
        favouriteFilm = "Hannah Montana: The Movie";
        System.out.println("My favourite film is " + favouriteFilm);
        String firstName = "QJ";
        printGreeting(firstName);

        int a = 10;
        int b = 4;
        System.out.println("Subtraction of " + a + " and " + b + " = " + subtraction(a, b));

        System.out.println(isStringLonger("book", 10));

    }
    private static void printGreeting(String name){
        System.out.println("Hello, "+ name);
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }
    public static boolean isStringLonger(String s, int length){
        return s.length() > length;
    }

}