package aut.utcluj.isp.ex5;

import aut.utcluj.isp.ex4.Equipment;
import aut.utcluj.isp.ex4.EquipmentHistoryDetails;
import aut.utcluj.isp.ex4.Operation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author stefan
 */
public class EquipmentHistory implements IEquipmentHistory{
    private List<EquipmentHistoryDetails> historyDetailsList;
    ArrayList<EquipmentHistoryDetails> list=new ArrayList<>();
    EquipmentHistory e=new EquipmentHistory();

    public void addEquipmentHistory(final String owner, final Operation operation, final LocalDateTime providedDate) {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<EquipmentHistoryDetails> filterEquipmentHistoryByOperation(final Operation operation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<EquipmentHistoryDetails> sortEquipmentHistoryByDateDesc() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<EquipmentHistoryDetails> getHistoryDetailsList() {
        return historyDetailsList;
    }
}
