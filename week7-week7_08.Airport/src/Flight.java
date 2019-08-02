/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
public class Flight {

    private Plane airplane;
    private String destin;

    public Flight(Plane plane, String destination) {
        this.airplane = plane;
        this.destin = destination;
    }

    public String toString() {
        return this.airplane.toString() +" "+ this.destin;
    }
}
