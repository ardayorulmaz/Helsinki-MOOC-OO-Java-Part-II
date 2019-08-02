/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
public class MilitaryService implements NationalService{
    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public void work() {
        if (this.daysLeft > 1) {
            this.daysLeft--;
        } else if (this.daysLeft == 1) {
            this.daysLeft = 0;
        }
    }

    public int getDaysLeft() {
        return daysLeft;
    }
}
