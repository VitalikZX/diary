package com.diary.model;

/**
 * Created by Vital on 05.03.2017.
 */
public class OneDishWghtPrtnsFtsCrbhdrtsEnrgy {
    private int weight;
    private double proteins;
    private double fats;
    private double carbohydrates;
    private int energy;

    public OneDishWghtPrtnsFtsCrbhdrtsEnrgy(int weight, double proteins, double fats, double carbohydrates, int energy) {
        this.weight = weight;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.energy = energy;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
