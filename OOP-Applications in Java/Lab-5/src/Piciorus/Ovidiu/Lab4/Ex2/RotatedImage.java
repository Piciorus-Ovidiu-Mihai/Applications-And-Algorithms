package Piciorus.Ovidiu.Lab4.Ex2;

public class RotatedImage implements Image {
    private String fileName;

    public RotatedImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display Rotated " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

}
