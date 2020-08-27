package aut.utcluj.isp.ex3;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author stefan
 */
public class EquipmentController {
    ArrayList<Equipment> list = new ArrayList<>();
    int nr = 0;

    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        try {
            list.add(equipment);
            nr++;

        } catch (Exception UnsupportedOperationException) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return list;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setList(ArrayList<Equipment> list) {
        this.list = list;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return nr;
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        HashMap<String, List<Equipment>> lista = new HashMap<>();

        for (Equipment e : list) {
            if (lista.containsKey(e.getOwner())) lista.get(e).add(e);
            else {
                HashMap<String, List<Equipment>> list = new HashMap<>();
            }
            return lista;
        }
return null;
    }


    /**
     * Remove a particular equipment from equipments list by serial number
     *
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        for (Equipment equipment : list) {
            if (equipment.getSerialNumber() == serialNumber) {
                Equipment aux;
                aux=equipment;
                list.remove(equipment);
                nr--;
                return aux;
            }
        }
        return null;
    }
}
