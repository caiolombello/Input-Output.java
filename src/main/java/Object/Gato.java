package Object;

import java.io.Serializable;

public class Gato implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer age;
    private String color;

    public Gato(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Gato() {
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}

