package Piciorus.Ovidiu.Lab3.ex3;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return " " + name + "(" + gender + ") at email" + email;
    }
}
