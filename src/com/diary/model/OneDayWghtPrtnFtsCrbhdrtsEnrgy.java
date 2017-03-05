package com.diary.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vital on 05.03.2017.
 */
public class OneDayWghtPrtnFtsCrbhdrtsEnrgy {
    private List<OneDishWghtPrtnsFtsCrbhdrtsEnrgy> listOfDishes = new ArrayList<>();
    private int allWeight;
    private double allProteinsInDay;
    private double allFatsInDay;
    private double allCarbohydratesInDay;
    private int allEnergyInDay;

    public OneDayWghtPrtnFtsCrbhdrtsEnrgy(List<OneDishWghtPrtnsFtsCrbhdrtsEnrgy> listOfDishes) {
        this.listOfDishes = listOfDishes;
        for (OneDishWghtPrtnsFtsCrbhdrtsEnrgy oneDishWghtPrtnsFtsCrbhdrtsEnrgy : listOfDishes){
            allWeight += oneDishWghtPrtnsFtsCrbhdrtsEnrgy.getWeight();
            allProteinsInDay += oneDishWghtPrtnsFtsCrbhdrtsEnrgy.getProteins();
            allFatsInDay += oneDishWghtPrtnsFtsCrbhdrtsEnrgy.getFats();
            allCarbohydratesInDay += oneDishWghtPrtnsFtsCrbhdrtsEnrgy.getCarbohydrates();
            allEnergyInDay += oneDishWghtPrtnsFtsCrbhdrtsEnrgy.getEnergy();
        }
    }

    public List<OneDishWghtPrtnsFtsCrbhdrtsEnrgy> getListOfDishes() {
        return listOfDishes;
    }

    public void setListOfDishes(List<OneDishWghtPrtnsFtsCrbhdrtsEnrgy> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }
}
