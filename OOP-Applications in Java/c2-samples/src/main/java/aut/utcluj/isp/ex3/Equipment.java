package aut.utcluj.isp.ex3;

/**
 * @author stefan
 */
public class Equipment {
    private String name;
    private String serialNumber;
    private String owner;
    private boolean taken;

    public Equipment(String serialNumber) {
        try {
            this.serialNumber = serialNumber;

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

    public Equipment(String name, String serialNumber, String owner) {
        try {
            this.name = name;
            this.serialNumber = serialNumber;
            this.owner = owner;
            setTaken(true);

        } catch (Exception UnsupportedOperationException) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    /**
     * Provide the owner of the equipment
     * Equipment should be set as taken
     *
     * @param owner - owner name
     */
    public void provideEquipmentToUser(final String owner) {
        try {
            Equipment e = new Equipment(owner);
            setTaken(true);
            setOwner(owner);
        } catch (Exception UnsupportedOperationException) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    /**
     * Equipment is returned to the office
     * Equipment should not be set as taken
     * Remove the owner
     */
    public void returnEquipmentToOffice() {
        try {


            setTaken(false);
            setOwner(null);

        } catch (Exception UnsupportedOperationException) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
