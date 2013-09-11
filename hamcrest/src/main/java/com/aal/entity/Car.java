package com.aal.entity;

/**
 * User: irfanansari
 * Date: 11/09/2013
 * Time: 03:38
 */
public class Car {
    private String make;
    private String model;
    private String derivative;
    private int engineSizeInCC;
    private String numberPlate;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDerivative() {
        return derivative;
    }

    public void setDerivative(String derivative) {
        this.derivative = derivative;
    }

    public int getEngineSizeInCC() {
        return engineSizeInCC;
    }

    public void setEngineSizeInCC(int engineSizeInCC) {
        this.engineSizeInCC = engineSizeInCC;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", derivative='" + derivative + '\'' +
                ", engineSizeInCC=" + engineSizeInCC +
                ", numberPlate='" + numberPlate + '\'' +
                '}';
    }
}
