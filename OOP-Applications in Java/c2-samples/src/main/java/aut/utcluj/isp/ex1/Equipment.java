package aut.utcluj.isp.ex1;

import java.util.Objects;

/**
 * @author stefan
 */
public class Equipment {
    private String name;
    private String serialNumber;

    public Equipment(String serialNumber) {
        try {
            this.name = "NONE";
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(name, equipment.name) &&
                Objects.equals(serialNumber, equipment.serialNumber);
    }

    @Override
    public String toString() {
        return name+"_"+serialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serialNumber);
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
