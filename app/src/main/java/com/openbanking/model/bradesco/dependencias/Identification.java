
package com.openbanking.model.bradesco.dependencias;

import com.google.gson.annotations.Expose;

public class Identification {

    @Expose
    private String checkDigit;
    @Expose
    private String code;
    @Expose
    private String name;
    @Expose
    private Object openingDate;
    @Expose
    private String relatedBranch;
    @Expose
    private String type;

    public String getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(String checkDigit) {
        this.checkDigit = checkDigit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Object openingDate) {
        this.openingDate = openingDate;
    }

    public String getRelatedBranch() {
        return relatedBranch;
    }

    public void setRelatedBranch(String relatedBranch) {
        this.relatedBranch = relatedBranch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
