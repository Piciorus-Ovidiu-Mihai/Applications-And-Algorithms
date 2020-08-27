package Piciorus.Ovidiu.Lab7.ex4;

import java.io.*;

public class Car implements Serializable {

    private String model;
    private double price;

    Car(String model, double price) {
        super();
        this.model = model;
        this.price = price;
    }

    String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
