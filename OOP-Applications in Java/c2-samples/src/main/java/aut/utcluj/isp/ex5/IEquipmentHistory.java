package aut.utcluj.isp.ex5;

import aut.utcluj.isp.ex4.EquipmentHistoryDetails;
import aut.utcluj.isp.ex4.Operation;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author stefan
 */
public interface IEquipmentHistory {
    /**
     * Add new history details
     *
     * @param owner        - ownen
     * @param operation    - operation ({@link Operation})
     * @param providedDate - provided date of the operation
     */
    void addEquipmentHistory(final String owner, final Operation operation, final LocalDateTime providedDate);

    /**
     * Return list of equipment history by operation param
     *
     * @param operation - can be {@link Operation#PROVIDE} or {@link Operation#RETURN}
     * @return list of equipment history filtered by operation
     */
    List<EquipmentHistoryDetails> filterEquipmentHistoryByOperation(final Operation operation);

    /**
     * Sort equipment history list by date DESC
     *
     * @return equipment history details sorted DESC by date
     */
    List<EquipmentHistoryDetails> sortEquipmentHistoryByDateDesc();
}
