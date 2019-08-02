/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;

/**
 *
 * @author Sparkcaster
 */
public class Barn {

    private MilkingRobot robot;
    private BulkTank tank;
 

    public Barn(BulkTank tank) {
        this.tank = tank;
        
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = new MilkingRobot();
        robot.setBulkTank(this.tank);
    }

    public void takeCareOf(Cow cow) {
        if (getBulkTank() == null) {
            throw new IllegalStateException("no tank is fixed");

        }
        getBulkTank().addToTank(cow.milk());
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (getBulkTank() == null) {
            throw new IllegalStateException("no tank is fixed");

        }
        for (Cow cow : cows) {
            getBulkTank().addToTank(cow.milk());
        }
    }

    public String toString() {
        return "Barn:" + this.tank.toString();
    }

}
