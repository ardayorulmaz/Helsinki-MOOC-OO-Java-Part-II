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
public class Farm implements Alive {

    private String name;

    private Barn barn;
    private LinkedList<Cow> cows;

    public Farm(String name, Barn barn) {
        this.name = name;

        this.barn = barn;
        this.cows = new LinkedList<Cow>();

    }

    public String getOwner() {
        return this.name;
    }

    public LinkedList<Cow> getBarnList() {
        return cows;
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void manageCows() {
        for (Cow cow : this.cows) {
            this.barn.getBulkTank().addToTank(cow.milk());
        }

    }

    public void installMilkingRobot(MilkingRobot robot) {

        this.barn.installMilkingRobot(robot);
    }

    public String GetCowStatus() {
        String status = "Animals: \n";
        if (this.cows.isEmpty()) {
            status = "No cows.";

        } else {

            for (Milkable cow : this.cows) {
                status += "        " + cow.toString();
            }

        }
        return status;
    }

    public String toString() {

        return "Farm owner:" + getOwner() + "\n" + this.barn.toString() + GetCowStatus();
    }

    @Override
    public void liveHour() {
        for (Cow cow : this.cows) {
            cow.liveHour();
        }
    }

}
