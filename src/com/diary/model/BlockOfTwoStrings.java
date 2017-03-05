package com.diary.model;

/**
 * Created by Vital on 05.03.2017.
 */
public class BlockOfTwoStrings {
    private StringBuilder strTraining;
    private StringBuilder strEducation;

    public BlockOfTwoStrings(StringBuilder strTraining, StringBuilder strEducation) {
        this.strTraining = strTraining;
        this.strEducation = strEducation;
    }

    public StringBuilder getStrTraining() {
        return strTraining;
    }

    public void setStrTraining(StringBuilder strTraining) {
        this.strTraining = strTraining;
    }

    public StringBuilder getStrEducation() {
        return strEducation;
    }

    public void setStrEducation(StringBuilder strEducation) {
        this.strEducation = strEducation;
    }
}
