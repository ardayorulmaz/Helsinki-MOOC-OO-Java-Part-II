
import java.util.HashMap;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sparkcaster
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> carplatelist;

    public VehicleRegister() {

        this.carplatelist = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!this.carplatelist.containsKey(plate)) {
            this.carplatelist.put(plate, owner);
            return true;
        } else {
            
            return false;
        }
    }

    public String get(RegistrationPlate plate) {
        if (!this.carplatelist.keySet().contains(plate)) {
            return null;
        }
        return this.carplatelist.get(plate);

    }

    public boolean delete(RegistrationPlate plate) {
        if (!this.carplatelist.keySet().contains(plate)) {
            return false;
        } else {
            this.carplatelist.remove(plate);
        }

        return true;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.carplatelist.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> carowners = new ArrayList<String>();
        for (String owners : this.carplatelist.values()) {
            if (!carowners.contains(owners)) {
                carowners.add(owners);
            }
        }
        for (String owners : carowners) {
            System.out.println(owners);
        }
    }

}
