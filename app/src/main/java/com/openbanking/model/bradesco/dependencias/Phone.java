
package com.openbanking.model.bradesco.dependencias;

import com.google.gson.annotations.Expose;

public class Phone {

    @Expose
    private String areaCode;
    @Expose
    private String countryCallingCode;
    @Expose
    private String number;
    @Expose
    private String type;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCountryCallingCode() {
        return countryCallingCode;
    }

    public void setCountryCallingCode(String countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
