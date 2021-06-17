
package com.openbanking.model.bradesco.dependencias;

import java.util.List;
import com.google.gson.annotations.Expose;


public class Availability {

    @Expose
    private String exception;
    @Expose
    private Boolean isPublicAccessAllowed;
    @Expose
    private List<Standard> standards;

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Boolean getIsPublicAccessAllowed() {
        return isPublicAccessAllowed;
    }

    public void setIsPublicAccessAllowed(Boolean isPublicAccessAllowed) {
        this.isPublicAccessAllowed = isPublicAccessAllowed;
    }

    public List<Standard> getStandards() {
        return standards;
    }

    public void setStandards(List<Standard> standards) {
        this.standards = standards;
    }

}
