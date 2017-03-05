package com.diary.model;

/**
 * Created by Vital on 05.03.2017.
 */
public class OneDishPrtnsFtsCrbhdrtsEnrgy {
    private double proteins;
    private double fats;
    private double carbohydrates;
    private int energy;

    public OneDishPrtnsFtsCrbhdrtsEnrgy(double proteins, double fats, double carbohydrates, int energy) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.energy = energy;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
