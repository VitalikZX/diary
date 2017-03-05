package com.diary.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vital on 05.03.2017.
 */
public class OneDayPrtnFtsCrbhdrtsEnrgy {
    private List<OneDishPrtnsFtsCrbhdrtsEnrgy> listOfDishes = new ArrayList<>();
    private double allProteinsInDay;
    private double allFatsInDay;
    private double allCarbohydratesInDay;
    private int allEnergyInDay;

    public OneDayPrtnFtsCrbhdrtsEnrgy(List<OneDishPrtnsFtsCrbhdrtsEnrgy> listOfDishes) {
        this.listOfDishes = listOfDishes;
        for (OneDishPrtnsFtsCrbhdrtsEnrgy oneDishPrtnsFtsCrbhdrtsEnrgy: listOfDishes){
            allProteinsInDay += oneDishPrtnsFtsCrbhdrtsEnrgy.getProteins();
            allFatsInDay += oneDishPrtnsFtsCrbhdrtsEnrgy.getFats();
            allCarbohydratesInDay += oneDishPrtnsFtsCrbhdrtsEnrgy.getCarbohydrates();
            allEnergyInDay += oneDishPrtnsFtsCrbhdrtsEnrgy.getEnergy();
        }
    }

    public List<OneDishPrtnsFtsCrbhdrtsEnrgy> getListOfDishes() {
        return listOfDishes;
    }

    public void setListOfDishes(List<OneDishPrtnsFtsCrbhdrtsEnrgy> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }
}
