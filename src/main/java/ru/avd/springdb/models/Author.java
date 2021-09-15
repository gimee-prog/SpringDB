package ru.avd.springdb.models;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {

    private long id;
    private String fio;
    private int age;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                '}';
    }

    public Author(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }
}
