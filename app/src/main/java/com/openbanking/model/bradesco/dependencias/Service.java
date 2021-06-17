
package com.openbanking.model.bradesco.dependencias;

import com.google.gson.annotations.Expose;

public class Service {

    @Expose
    private String additionalInfo;
    @Expose
    private String code;
    @Expose
    private String name;

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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

}
