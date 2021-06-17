
package com.openbanking.model.bradesco.produtos;

import com.google.gson.annotations.Expose;

public class Maximum {

    @Expose
    private String currency;
    @Expose
    private String value;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
