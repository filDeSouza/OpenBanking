
package com.openbanking.model.bradesco.produtos;

import java.util.List;
import com.google.gson.annotations.Expose;


public class Fees {

    @Expose
    private List<Object> otherServices;
    @Expose
    private List<PriorityService> priorityServices;

    public List<Object> getOtherServices() {
        return otherServices;
    }

    public void setOtherServices(List<Object> otherServices) {
        this.otherServices = otherServices;
    }

    public List<PriorityService> getPriorityServices() {
        return priorityServices;
    }

    public void setPriorityServices(List<PriorityService> priorityServices) {
        this.priorityServices = priorityServices;
    }

}
