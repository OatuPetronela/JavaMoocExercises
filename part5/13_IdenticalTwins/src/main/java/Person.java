
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (compared == null || getClass() != compared.getClass()) return false; // Not of the same type

        Person other = (Person) compared;

        return Objects.equals(name, other.name) &&
                Objects.equals(birthday, other.birthday) &&
                height == other.height &&
                weight == other.weight;
    }

}
