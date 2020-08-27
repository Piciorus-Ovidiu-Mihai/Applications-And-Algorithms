package Piciorus.Ovidiu.Lab11.ex2;


public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product (String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name=name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity() {
        this.quantity=quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice() {
        this.price=price;
    }
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Product)) {
            return false;
        }

        Product x = (Product) o;

        return x.name.equals(name);
    }
    public final int hashCode(){
        return (int) (name.hashCode());
    }

}