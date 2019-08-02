/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class AirportPanelInterface {

    private Scanner reader;
    private ArrayList<Plane> planelist;
    private ArrayList<Flight> flightlist;

    public AirportPanelInterface(Scanner reader) {
        this.reader = reader;
        this.planelist = new ArrayList<Plane>();
        this.flightlist = new ArrayList<Flight>();
    }

    public void startAPI() {

        while (true) {
            System.out.println("Airport panel \n--------------------");
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit ");

            String input = reader.nextLine();

            if (input.equals("x")) {
                break;

            } else if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            }

        }

    }

    public void startFS() {

        while (true) {
            System.out.println("Flight service\n------------");
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");
            String fsinput = reader.nextLine();

            if (fsinput.equals("x")) {
                break;
            } else if (fsinput.equals("1")) {
                printPlanes();
            } else if (fsinput.equals("2")) {
                printFlights();
            } else if (fsinput.equals("3")) {
                printPlaneInfo();
            }

        }
    }

    private void addAirplane() {
        System.out.println("Give plane ID:");
        String id = reader.nextLine();
        System.out.println("Give plane capacity:");
        int capacity = Integer.parseInt(reader.nextLine());
        Plane newplane = new Plane(id, capacity);
        planelist.add(newplane);
    }

    private void addFlight() {
        System.out.println("Give plane ID:");
        String planeid = reader.nextLine();

        System.out.println("Give departure airport code:");
        String from = reader.nextLine();

        System.out.println("Give destination airport code:");
        String to = reader.nextLine();
        String destin = "(" + from + "-" + to + ")";

        Flight newflight = new Flight(getPlane(planeid), destin);
        flightlist.add(newflight);
    }

    public void printPlanes() {

        for (Plane plane : planelist) {
            System.out.println(plane);
        }

    }

    public void printFlights() {

        for (Flight flight : flightlist) {

            System.out.println(flight);
        }
    }

    public void printPlaneInfo() {
        System.out.println("Give plane ID:");
        String idinput = reader.nextLine();
        for (Plane plane : planelist) {
            if (plane.getId().equals(idinput)) {
                System.out.println(plane);
            }
        }

    }

    public Plane getPlane(String identifer) {
        for (Plane plane : planelist) {
            if (plane.getId().equals(identifer)) {
                return plane;
            }

        }
        return null;

    }

}
