
package com.openbanking.model.bradesco.dependencias;

import com.google.gson.annotations.Expose;


public class Standard {

    @Expose
    private String closingTime;
    @Expose
    private String openingTime;
    @Expose
    private String weekday;

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

}
