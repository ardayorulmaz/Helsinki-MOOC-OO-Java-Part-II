/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesearch;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Set;

/**
 *
 * @author Sparkcaster
 */
public class PSI {

    private Scanner reader;
    private Map<String, List<String>> pblist;
    private Map<String, List<String>> addlist;

    public PSI() {
        this.pblist = new HashMap<String, List<String>>();
        this.addlist = new HashMap<String, List<String>>();
        this.reader = new Scanner(System.in);
    }

    public void startUI() {
        printMenu();

        while (true) {

            String input = this.reader.nextLine();
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                this.addNumber();

            } else if (input.equals("2")) {
                this.searchNoByName();
            } else if (input.equals("3")) {
                this.searchNameByPhone();
            } else if (input.equals("4")) {
                this.addAdress();
            } else if (input.equals("5")) {
                System.out.println("whose information:");
                String infoname = this.reader.nextLine();
                this.searchInfo(infoname);
            } else if (input.equals("6")) {
                this.remove();
            } else if (input.equals("7")) {
                this.filteredSearch();
            }
        }
    }

    public void printMenu() {
        System.out.println("phone search available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }

    public String readInput() {
        String input = this.reader.nextLine();
        return input;
    }

    public void addNumber() {
        System.out.println("whose number:");
        String personname = readInput();
        System.out.println("number:");
        String phonenumber = readInput();
        if (!this.pblist.keySet().contains(personname)) {
            this.pblist.put(personname, new ArrayList<String>());

        }

        this.pblist.get(personname).add(phonenumber);
    }

    public void addAdress() {
        System.out.println("whose address:");
        String pAddAddr = this.reader.nextLine();
        System.out.println("street:");
        String pAddStr = this.reader.nextLine();
        System.out.println("city:");
        String pAddCity = this.reader.nextLine();
        if (!this.addlist.keySet().contains(pAddAddr)) {
            this.addlist.put(pAddAddr, new ArrayList<String>());

        }
        this.addlist.get(pAddAddr).add(pAddStr);
        this.addlist.get(pAddAddr).add(pAddCity);

    }

    public void searchNoByName() {
        System.out.println("whose number");
        String nsearch = this.reader.nextLine();
        if (!this.pblist.keySet().contains(nsearch) || this.pblist.get(nsearch).isEmpty()) {

            System.out.println("not found");

        } else {
            for (String string : this.pblist.get(nsearch)) {
                System.out.println(string);

            }
        }
    }

    public void searchNameByPhone() {
        System.out.println("number:");
        String namebyno = this.reader.nextLine();

        for (Map.Entry<String, List<String>> entry : this.pblist.entrySet()) {
            if (entry.getValue().contains(namebyno)) {
                System.out.print(entry.getKey());

            } else {
                System.out.println("not found");
            }

        }

    }

    public void searchInfo(String infoname) {

        if (!this.addlist.keySet().contains(infoname) && !this.pblist.containsKey(infoname)) {
            System.out.println("not found");
        } else {

            if (this.addlist.containsKey(infoname)) {
                System.out.print("address: ");
                System.out.print(this.addlist.get(infoname).get(0));
                System.out.println(" " + this.addlist.get(infoname).get(1));
            } else {
                System.out.println("address unknown");

            }

            if (!this.pblist.keySet().contains(infoname) || this.pblist.get(infoname).isEmpty()) {

                System.out.println("phone number not found");

            } else {
                System.out.println("phone numbers:");
                for (String string : this.pblist.get(infoname)) {
                    System.out.println(string);

                }
            }

        }
    }

    public void remove() {
        System.out.println("whose information:");
        String removePerson = this.reader.nextLine();
        this.addlist.remove(removePerson);
        this.pblist.remove(removePerson);
    }

    public void filteredResult(String string) {
        System.out.println(" " + string);
        if (!this.addlist.keySet().contains(string)) {
            System.out.println("  address unknown");
        } else {
            System.out.println("  address:" + this.addlist.get(string).get(0) + " " + this.addlist.get(string).get(1));
        }
        if (!this.pblist.keySet().contains(string)) {
            System.out.println("  phone number not found");

        } else {
            System.out.println("  phone numbers:");
            for (int i = 0; i < this.pblist.get(string).size(); i++) {
                System.out.println("   " + this.pblist.get(string).get(i));
            }

        }

    }

    public boolean isinAdresses(String string) {
        for (Map.Entry<String, List<String>> list : this.addlist.entrySet()) {
            if ((list.getValue().get(1).contains(string)) || list.getValue().get(0).contains(string)) {
                return true;
            }
        }

        return false;
    }

    public boolean isinNames(String string) {
        List<String> results = new ArrayList<String>();
        Set<String> allnames = new HashSet<String>();
        for (String s : this.addlist.keySet()) {
            if (s.contains(string)) {
                allnames.add(s);
            }
        }
        for (String x : this.pblist.keySet()) {
            if (x.contains(string)) {
                allnames.add(x);
            }
        }
        for (Map.Entry<String, List<String>> list : this.addlist.entrySet()) {
            if (list.getValue().get(0).contains(string) || list.getValue().get(1).contains(string)) {
                allnames.add(list.getKey());

            }
        }
        for (String resultword : allnames) {
            results.add(resultword);
        }
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i).contains(string)) {
                return true;
            }

        }
        return false;
    }

    public void filteredSearch() {
        System.out.println("keyword (if empty, all listed):");
        String finput = this.reader.nextLine();

        if (finput.isEmpty()) {
            this.FSgetall();

        } else if (!this.isinAdresses(finput) && !this.isinNames(finput)) {
            System.out.println("not found");
        } else {
            this.FSgetKeyword(finput);

        }

    }

    public void FSgetKeyword(String string) {
        List<String> results = new ArrayList<String>();
        Set<String> allnames = new HashSet<String>();
        for (String s : this.addlist.keySet()) {
            if (s.contains(string)) {
                allnames.add(s);
            }
        }
        for (String x : this.pblist.keySet()) {
            if (x.contains(string)) {
                allnames.add(x);
            }
        }
        for (Map.Entry<String, List<String>> list : this.addlist.entrySet()) {
            if (list.getValue().get(0).contains(string) || list.getValue().get(1).contains(string)) {
                allnames.add(list.getKey());

            }
        }
        for (String resultword : allnames) {
            results.add(resultword);
        }
        Collections.sort(results);
        for (String result : results) {
            this.filteredResult(result);
        }
    }

    public void FSgetall() {
        List<String> results = new ArrayList<String>();
        Set<String> allnames = new HashSet<String>();
        for (String string : this.pblist.keySet()) {
            allnames.add(string);
        }
        for (String string : this.addlist.keySet()) {
            allnames.add(string);
        }
        for (String string : allnames) {
            results.add(string);
        }
        Collections.sort(results);
        for (String string : results) {
            this.filteredResult(string);
        }
    }

}
