package Piciorus.Ovidiu.Lab4.ex2;

public class MainAuthor {
    public static void main(String[] args) {
        Author var = new Author("Ovidiu", "ovidiu@yahoo.com", 'm');
        System.out.println("Test: " + var.toString());
        var.setEmail("mihai@yahoo.com");
        System.out.println("New email: " + var.getEmail());
        System.out.println("New test: " + var.toString());
    }
}
