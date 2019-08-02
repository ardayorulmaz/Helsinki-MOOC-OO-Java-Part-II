/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author Sparkcaster
 */
public enum Rating {
    BAD("-5"), MEDIOCRE("-3"), NOT_WATCHED("0"), NEUTRAL("1"), FINE("3"), GOOD("5");

    private String name;

    private Rating(String name) {
        this.name = name;
    }

    public int getValue() {
        return Integer.parseInt(this.name);
    }

}
