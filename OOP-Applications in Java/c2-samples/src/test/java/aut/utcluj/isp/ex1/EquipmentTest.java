package aut.utcluj.isp.ex1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author stefan
 */
public class EquipmentTest {
    @Test
    public void testCreate() {
        final Equipment equipment = new Equipment("Dell", "SN123");
        assertEquals("Equipment name should be 'Dell'", "Dell", equipment.getName());
        assertEquals("Equipment serial number should be 'SN123'", "SN123", equipment.getSerialNumber());
    }

    @Test
    public void testCreate2() {
        final Equipment equipment = new Equipment("SN123");
        assertEquals("Default equipment name should be 'NONE'", "NONE", equipment.getName());
        assertEquals("Equipment serial number should be 'SN123'", "SN123", equipment.getSerialNumber());
    }

    @Test
    public void testEquipmentEquals() {
        final Equipment firstEquipment = new Equipment("Dell", "SN123");
        final Equipment secondEquipment = new Equipment("Dell", "SN123");
        assertTrue("Equipment objects should be equals", firstEquipment.equals(secondEquipment));
    }

    @Test
    public void testDisplayEquipmentObject() {
        final Equipment firstEquipment = new Equipment("Dell", "SN123");
        assertEquals("Equipment details should be 'Dell_SN123'", "Dell_SN123", firstEquipment.toString());

        final Equipment secondEquipment = new Equipment("Dell", "SN124");
        assertEquals("Equipment details should be 'Dell_SN124'", "Dell_SN124", secondEquipment.toString());
    }
}