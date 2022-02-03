package LabGenerics.Jar;

public class Main {
    public static void main(String[] args) {
        Jar<Pickle> jarOfPickles = new Jar<Pickle>();
        Jar<String> jar = new Jar<String>();

        jar.add("test");
        jar.add("adklfj");


        jarOfPickles.add(new Pickle());
        jarOfPickles.add(new Pickle());

        Pickle pickle = jarOfPickles.remove();
    }
}
