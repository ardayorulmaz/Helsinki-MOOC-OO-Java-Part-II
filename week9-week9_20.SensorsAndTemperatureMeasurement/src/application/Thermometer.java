/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Sparkcaster
 */
import java.util.Random;

public class Thermometer implements Sensor {

    private String status;

    public Thermometer() {
        this.off();
        this.status = "off";
    }

    @Override
    public boolean isOn() {
        if (this.status.equals("on")) {
            return true;
        }
        return false;
    }

    @Override
    public void on() {
        this.status = "on";
    }

    @Override
    public void off() {
        this.status = "off";
    }

    @Override
    public int measure() {
        Random random = new Random();
        if (this.isOn()) {

            return random.nextInt(61) - 30;
        }
        throw new IllegalStateException("Not supported yet.");
    }

}
