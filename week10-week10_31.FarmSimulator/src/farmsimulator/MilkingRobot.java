/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Sparkcaster
 */
public class MilkingRobot {

    private BulkTank bulktank;

    public MilkingRobot() {
   this.bulktank=null;
    }

    public void setBulkTank(BulkTank tank) {
        this.bulktank = tank;
    }

    public BulkTank getBulkTank() {
        return this.bulktank;
    }

    public void milk(Milkable milkable) {
        if (getBulkTank() == null) {

            throw new IllegalStateException("no tank is fixed");
        }
        this.bulktank.addToTank(milkable.milk());

    }

}
