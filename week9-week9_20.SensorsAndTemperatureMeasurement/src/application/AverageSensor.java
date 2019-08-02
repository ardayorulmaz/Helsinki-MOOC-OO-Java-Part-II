/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sparkcaster
 */
public class AverageSensor implements Sensor {

    
    private ArrayList<Sensor> sensorlist;
    private List<Integer> readinglist;

    public AverageSensor() {
        this.readinglist = new ArrayList<Integer>();

        this.sensorlist = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor additional) {

        this.sensorlist.add(additional);
    }

    public List<Integer> readings() {

        return this.readinglist;
    }

    @Override

    public boolean isOn() {

        for (Sensor sensor : sensorlist) {
            if (sensor.isOn()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public void on() {
        for (Sensor sensor : sensorlist) {
            sensor.on();
        }

    }

    @Override
    public void off() {
         for (Sensor sensor : sensorlist) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int total = 0;
        if (!this.isOn() || this.sensorlist.isEmpty()) {
            throw new IllegalStateException("Not supported yet.");
        }
        for (Sensor sensor : this.sensorlist) {
            total += sensor.measure();
        }
        int measurement = total / this.sensorlist.size();
        this.readinglist.add(measurement);
        return measurement;
    }

}
