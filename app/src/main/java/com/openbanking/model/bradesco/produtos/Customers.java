
package com.openbanking.model.bradesco.produtos;

import com.google.gson.annotations.Expose;


public class Customers {

    @Expose
    private String rate;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

}
