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
        



    }
    private static void printGreeting(String name){
        System.out.println("Hello, "+ name);
    }

}