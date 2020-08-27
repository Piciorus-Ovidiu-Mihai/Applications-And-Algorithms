package Piciorus.Ovidiu.Lab6.ex4;

public class Definition {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Definition(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Definittion{" +
                "description='" + description + '\'' +
                '}';
    }


}

