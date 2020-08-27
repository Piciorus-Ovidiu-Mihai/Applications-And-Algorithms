package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Notebook extends Equipment{
    private String osVersion;
    private String name;
    private String serialNumber;

    public Notebook(String name, String serialNumber, String osVersion) {
        super(name,serialNumber);
        try {
            this.name=name;
            this.serialNumber=serialNumber;
            this.osVersion=osVersion;

        } catch (Exception UnsupportedOperationException) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String start() {
        return "Notebook "+name+" started";
    }
}
