package aut.utcluj.isp.ex2;




/**
 * @author stefan
 */
public class Equipment{
    private String name;
    private String serialNumber;
    public Notebook n;

    public Equipment(String serialNumber) {
        try {
            this.name = "NONE";
            this.serialNumber=serialNumber;
        } catch (Exception UnsupportedOperationException) {

            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public Equipment(String name, String serialNumber) {
        try {
            this.name = name;
            this.serialNumber = serialNumber;
        } catch (Exception UnsupportedOperationException) {

            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
