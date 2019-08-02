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
public class Film {

    private String name;

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object obj) {
         Film compared = (Film) obj;
        if (this.getName() == compared.getName()) {
            return true;
            
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
