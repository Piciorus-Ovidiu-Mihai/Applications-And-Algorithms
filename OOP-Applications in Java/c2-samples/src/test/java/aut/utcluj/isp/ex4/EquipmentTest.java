package aut.utcluj.isp.ex4;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * @author stefan
 */
public class EquipmentTest {
    @Test
    public void testProvideEquipmentToUser() {
        final Equipment equipment = new Equipment("Dell", "SN123");
        equipment.provideEquipmentToUser("John", LocalDateTime.now());
        assertEquals("Owner is 'John'", "John", equipment.getCurrentOwner());
        assertTrue("Equipment is taken", equipment.isTaken());
    }

    @Test(expected = EquipmentAlreadyProvidedException.class)
    public void testProvideEquipmentToUserThrowsExceptionWhenEquipmentIsAlreadyProvided() {
        final Equipment equipment = new Equipment("Dell", "SN123");
        equipment.provideEquipmentToUser("John", LocalDateTime.now());
        assertEquals("Owner is 'John'", "John", equipment.getCurrentOwner());
        assertTrue("Equipment is taken", equipment.isTaken());

        // provide equipment second time
        equipment.provideEquipmentToUser("John", LocalDateTime.now());
    }

    @Test
    public void testReturnEquipmentToOffice() {
        final Equipment equipment = new Equipment("Dell", "SN123");

        // provide equipment to user
        equipment.provideEquipmentToUser("John", LocalDateTime.now());
        assertEquals("Owner is 'John'", "John", equipment.getCurrentOwner());
        assertTrue("Equipment is taken", equipment.isTaken());

        // return equipment to the office
        equipment.returnEquipmentToOffice();
        assertNull("Current owner should be null", equipment.getCurrentOwner());
        assertFalse("Equipment is not taken anymore", equipment.isTaken());
    }

    @Test(expected = EquipmentNotProvidedException.class)
    public void testReturnEquipmentToOfficeThrowsExceptionWhenEquipmentNotProvided() {
        final Equipment equipment = new Equipment("Dell", "SN123");

        // return equipment to the office
        equipment.returnEquipmentToOffice();
    }
}