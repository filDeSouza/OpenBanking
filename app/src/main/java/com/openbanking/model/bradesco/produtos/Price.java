
package com.openbanking.model.bradesco.produtos;

import com.google.gson.annotations.Expose;

public class Price {

    @Expose
    private String currency;
    @Expose
    private Customers customers;
    @Expose
    private String interval;
    @Expose
    private String monthlyFee;
    @Expose
    private String value;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(String monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
