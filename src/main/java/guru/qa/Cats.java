package guru.qa;

public class Cats extends Felidae implements Meow {
    private String breed;
    public Cats(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        return "Мяу";
    }

    public void isOld() {
        if (age > 1) {
            System.out.printf("%s уже не котенок \n", name);
        } else {
            System.out.printf("%s еще котенок \n", name);
        }
    }

}

