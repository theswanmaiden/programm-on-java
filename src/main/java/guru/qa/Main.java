package guru.qa;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Kitty", 5);
        Cats cat2 = new Cats("Kat", 2);
        Dogs dog = new Dogs("Puppy", 10);
        dog.isOld("Jack", 10);
        cat.isOld("Bunny", 1);


        Meow[] meow = new Meow[]{cat, cat2};
        for (int i = 0; i < meow.length; i++) {
            System.out.println(meow[i].voice());
        }
    }
}
