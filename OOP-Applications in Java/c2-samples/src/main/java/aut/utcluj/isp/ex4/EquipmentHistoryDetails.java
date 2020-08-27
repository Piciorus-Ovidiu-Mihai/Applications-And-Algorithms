package aut.utcluj.isp.ex4;

import java.time.LocalDateTime;

/**
 * @author stefan
 */
public class EquipmentHistoryDetails {
    private String owner;
    private Operation operation;
    private LocalDateTime date;

    public EquipmentHistoryDetails(String owner, Operation operation, LocalDateTime date) {
        this.owner = owner;
        this.operation = operation;
        this.date = date;
    }

    public String getOwner() {
        return owner;
    }

    public Operation getOperation() {
        return operation;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
