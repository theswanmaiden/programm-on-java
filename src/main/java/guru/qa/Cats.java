package guru.qa;

public class Cats extends Felidae implements Meow {
    public Cats(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        return "Мяу";
    }

    public void isOld(String name, int age) {
        if (age > 1) {
            System.out.printf("%s уже не котенок \n", name);
        } else {
            System.out.printf("%s еще котенок \n", name);
        }
    }
}

