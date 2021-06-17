
package com.openbanking.model.bradesco.produtos;

import com.google.gson.annotations.Expose;


public class Service {

    @Expose
    private String chargingTriggerInfo;
    @Expose
    private String code;
    @Expose
    private String eventLimitQuantity;
    @Expose
    private String freeEventQuantity;

    public String getChargingTriggerInfo() {
        return chargingTriggerInfo;
    }

    public void setChargingTriggerInfo(String chargingTriggerInfo) {
        this.chargingTriggerInfo = chargingTriggerInfo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEventLimitQuantity() {
        return eventLimitQuantity;
    }

    public void setEventLimitQuantity(String eventLimitQuantity) {
        this.eventLimitQuantity = eventLimitQuantity;
    }

    public String getFreeEventQuantity() {
        return freeEventQuantity;
    }

    public void setFreeEventQuantity(String freeEventQuantity) {
        this.freeEventQuantity = freeEventQuantity;
    }

}
