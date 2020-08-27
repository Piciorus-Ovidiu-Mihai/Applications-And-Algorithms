package Piciorus.Ovidiu.Lab7.ex4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String args[]) {
        Car c = new Car("Fiat", 3000);
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C:\\Users\\Ovidiu\\Desktop\\UTCN AN 2\\ISP-Ingineria Sistemelor de Programe\\Laboratoare\\piciorus-ovidiu-mihai-30123-isp-2019\\Lab-7\\src\\Piciorus\\Ovidiu\\Lab7\\ex4\\car.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(c);
            out.close();
            fileOut.close();
            System.out.print("Serialized data is saved");
        } catch (IOException i) {
            i.printStackTrace();
        }
        Car c1;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\Ovidiu\\Desktop\\UTCN AN 2\\ISP-Ingineria Sistemelor de Programe\\Laboratoare\\piciorus-ovidiu-mihai-30123-isp-2019\\Lab-7\\src\\Piciorus\\Ovidiu\\Lab7\\ex4\\car.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            c1 = (Car) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException ce) {
            System.out.println("Employee class not found");
            ce.printStackTrace();
            return;
        }

        System.out.println("\nDeserialized Employee...");
        System.out.println("Name: " + c1.getModel());
        System.out.println("Address: " + c1.getPrice());

    }
}
