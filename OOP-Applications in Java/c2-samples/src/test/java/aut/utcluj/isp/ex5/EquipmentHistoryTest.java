package aut.utcluj.isp.ex5;

import aut.utcluj.isp.ex4.EquipmentHistoryDetails;
import aut.utcluj.isp.ex4.Operation;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * @author stefan
 */
public class EquipmentHistoryTest {
    @Test
    public void testAddEquipmentHistory() {
        final EquipmentHistory equipmentHistory = new EquipmentHistory();
        equipmentHistory.addEquipmentHistory("John", Operation.PROVIDE, LocalDateTime.now());
        assertThat("Equipment history instance should be 'IEquipmentHistory'", equipmentHistory, instanceOf(IEquipmentHistory.class));
        assertNotNull("Equipment history details should not be null", equipmentHistory.getHistoryDetailsList());
        assertEquals("Equipment history details size should be 1", 1, equipmentHistory.getHistoryDetailsList().size());
    }

    @Test
    public void testFilterEquipmentHistoryByOperation() {
        final LocalDateTime provideDate = LocalDateTime.now();
        final EquipmentHistory equipmentHistory = new EquipmentHistory();
        equipmentHistory.addEquipmentHistory("John", Operation.PROVIDE, provideDate);

        final LocalDateTime returnDate = LocalDateTime.now();
        equipmentHistory.addEquipmentHistory("John", Operation.RETURN, returnDate);

        final List<EquipmentHistoryDetails> historyByProvidedOperation = equipmentHistory.filterEquipmentHistoryByOperation(Operation.PROVIDE);
        assertNotNull("List should not be null", historyByProvidedOperation);
        assertEquals("List size should be 1", 1, historyByProvidedOperation.size());
        assertEquals("Provided date should be the same", provideDate, historyByProvidedOperation.get(0).getDate());

        final List<EquipmentHistoryDetails> historyByReturnOperation = equipmentHistory.filterEquipmentHistoryByOperation(Operation.RETURN);
        assertNotNull("List should not be null", historyByReturnOperation);
        assertEquals("List size should be 1", 1, historyByReturnOperation.size());
        assertEquals("Provided date should be the same", returnDate, historyByReturnOperation.get(0).getDate());
    }

    @Test
    public void testSortEquipmentHistoryByDateDesc() {
        final LocalDateTime provideDate = LocalDateTime.now();
        final LocalDateTime returnDate = LocalDateTime.now().plusHours(1);

        final EquipmentHistory equipmentHistory = new EquipmentHistory();
        equipmentHistory.addEquipmentHistory("John", Operation.PROVIDE, provideDate);
        equipmentHistory.addEquipmentHistory("John", Operation.RETURN, returnDate);

        final List<EquipmentHistoryDetails> historyDetails = equipmentHistory.sortEquipmentHistoryByDateDesc();
        assertNotNull("History details should not be null", historyDetails);
        assertEquals("History details size should be 2", 2, historyDetails.size());
        assertEquals("First history should have RETURN operation type", Operation.RETURN, historyDetails.get(0).getOperation());
        assertEquals("First history should have return date", returnDate, historyDetails.get(0).getDate());
        assertEquals("Second history should have RETURN operation type", Operation.PROVIDE, historyDetails.get(1).getOperation());
        assertEquals("Second history should have return date", provideDate, historyDetails.get(1).getDate());
    }
}