
package com.openbanking.model.bradesco.produtos;

import com.google.gson.annotations.Expose;

public class TermsConditions {

    @Expose
    private String closingProcessInfo;
    @Expose
    private String elegibilityCriteriaInfo;
    @Expose
    private MinimumBalance minimumBalance;

    public String getClosingProcessInfo() {
        return closingProcessInfo;
    }

    public void setClosingProcessInfo(String closingProcessInfo) {
        this.closingProcessInfo = closingProcessInfo;
    }

    public String getElegibilityCriteriaInfo() {
        return elegibilityCriteriaInfo;
    }

    public void setElegibilityCriteriaInfo(String elegibilityCriteriaInfo) {
        this.elegibilityCriteriaInfo = elegibilityCriteriaInfo;
    }

    public MinimumBalance getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(MinimumBalance minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

}
