package Piciorus.Ovidiu.Lab4.Ex2;


import java.util.Scanner;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;
    private RotatedImage rotatedImage;
    private Scanner in = new Scanner(System.in);

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        int x = in.nextInt();
        if (x == 0) {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
        else {
                if (rotatedImage == null) {
                    rotatedImage = new RotatedImage((fileName));
                }
                rotatedImage.display();
                //de refacut, un if in care sa vad daca real = filename or rotated=filename


        }
    }
}


