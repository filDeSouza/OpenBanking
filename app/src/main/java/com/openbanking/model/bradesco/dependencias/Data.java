
package com.openbanking.model.bradesco.dependencias;

import com.google.gson.annotations.Expose;


public class Data {

    @Expose
    private Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}
