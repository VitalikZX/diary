package com.diary.model;

/**
 * Created by Vital on 05.03.2017.
 */
public class Data {
    private OneDayWghtPrtnFtsCrbhdrtsEnrgy oneDayWghtPrtnFtsCrbhdrtsEnrgy;
    private OneDayToDoList oneDayToDoList;
    private BlockOfTwoStrings morningBlock;
    private BlockOfTwoStrings eveningBlock;

    public Data(OneDayWghtPrtnFtsCrbhdrtsEnrgy oneDayWghtPrtnFtsCrbhdrtsEnrgy, OneDayToDoList oneDayToDoList, BlockOfTwoStrings morningBlock, BlockOfTwoStrings eveningBlock) {
        this.oneDayWghtPrtnFtsCrbhdrtsEnrgy = oneDayWghtPrtnFtsCrbhdrtsEnrgy;
        this.oneDayToDoList = oneDayToDoList;
        this.morningBlock = morningBlock;
        this.eveningBlock = eveningBlock;
    }

    public OneDayWghtPrtnFtsCrbhdrtsEnrgy getOneDayWghtPrtnFtsCrbhdrtsEnrgy() {
        return oneDayWghtPrtnFtsCrbhdrtsEnrgy;
    }

    public void setOneDayWghtPrtnFtsCrbhdrtsEnrgy(OneDayWghtPrtnFtsCrbhdrtsEnrgy oneDayWghtPrtnFtsCrbhdrtsEnrgy) {
        this.oneDayWghtPrtnFtsCrbhdrtsEnrgy = oneDayWghtPrtnFtsCrbhdrtsEnrgy;
    }

    public OneDayToDoList getOneDayToDoList() {
        return oneDayToDoList;
    }

    public void setOneDayToDoList(OneDayToDoList oneDayToDoList) {
        this.oneDayToDoList = oneDayToDoList;
    }

    public BlockOfTwoStrings getMorningBlock() {
        return morningBlock;
    }

    public void setMorningBlock(BlockOfTwoStrings morningBlock) {
        this.morningBlock = morningBlock;
    }

    public BlockOfTwoStrings getEveningBlock() {
        return eveningBlock;
    }

    public void setEveningBlock(BlockOfTwoStrings eveningBlock) {
        this.eveningBlock = eveningBlock;
    }
}
