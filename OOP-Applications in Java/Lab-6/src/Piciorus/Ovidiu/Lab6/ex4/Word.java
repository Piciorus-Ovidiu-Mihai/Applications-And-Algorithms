package Piciorus.Ovidiu.Lab6.ex4;

import java.util.Objects;

public class Word {
    private String name;

    public Word(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(name, word.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Word{" +
                "name='" + name + '\'' +
                '}';
    }
}
