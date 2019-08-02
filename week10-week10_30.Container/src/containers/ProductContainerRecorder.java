/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Sparkcaster
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory record;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.setInVolume(initialVolume);
        this.record = new ContainerHistory();
        this.record.add(initialVolume);
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.record.add(getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {

        double value = super.takeFromTheContainer(amount);
        this.record.add(getVolume());
        return value;
    }

    public String history() {
        return this.record.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + this.record.maxValue());
        System.out.println("Smallest product amount: " + this.record.minValue());
        System.out.println("Average: " + this.record.average());
        System.out.println("Greatest change: " + this.record.greatestFluctuation());
        System.out.println("Variance: " + this.record.variance());

    }
}
