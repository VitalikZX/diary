package com.diary.model;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Vital on 05.03.2017.
 */
public class OneDayToDoList {
    private Map<Time, String> toDoList = new TreeMap<>();

    public OneDayToDoList(Map<Time, String> toDoList) {
        this.toDoList = toDoList;
    }

    public Map<Time, String> getToDoList() {
        return toDoList;
    }

    public void setToDoList(Map<Time, String> toDoList) {
        this.toDoList = toDoList;
    }
}
