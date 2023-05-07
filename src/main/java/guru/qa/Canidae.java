package guru.qa;

public class Canidae {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Canidae (String name, int age) {
        this.name = name;
        this.age = age;
    }
}
