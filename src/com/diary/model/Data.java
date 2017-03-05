package com.diary.model;

/**
 * Created by Vital on 05.03.2017.
 */
public class Data {
    private OneDayPrtnFtsCrbhdrtsEnrgy oneDayPrtnFtsCrbhdrtsEnrgy;
    private OneDayToDoList oneDayToDoList;
    private BlockOfTwoStrings morningBlock;
    private BlockOfTwoStrings eveningBlock;

    public Data(OneDayPrtnFtsCrbhdrtsEnrgy oneDayPrtnFtsCrbhdrtsEnrgy, OneDayToDoList oneDayToDoList, BlockOfTwoStrings morningBlock, BlockOfTwoStrings eveningBlock) {
        this.oneDayPrtnFtsCrbhdrtsEnrgy = oneDayPrtnFtsCrbhdrtsEnrgy;
        this.oneDayToDoList = oneDayToDoList;
        this.morningBlock = morningBlock;
        this.eveningBlock = eveningBlock;
    }

    public OneDayPrtnFtsCrbhdrtsEnrgy getOneDayPrtnFtsCrbhdrtsEnrgy() {
        return oneDayPrtnFtsCrbhdrtsEnrgy;
    }

    public void setOneDayPrtnFtsCrbhdrtsEnrgy(OneDayPrtnFtsCrbhdrtsEnrgy oneDayPrtnFtsCrbhdrtsEnrgy) {
        this.oneDayPrtnFtsCrbhdrtsEnrgy = oneDayPrtnFtsCrbhdrtsEnrgy;
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
