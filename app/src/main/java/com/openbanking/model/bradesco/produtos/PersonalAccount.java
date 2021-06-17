
package com.openbanking.model.bradesco.produtos;

import java.util.List;
import com.google.gson.annotations.Expose;

public class PersonalAccount {

    @Expose
    private String additionalInfo;
    @Expose
    private Fees fees;
    @Expose
    private List<IncomeRate> incomeRate;
    @Expose
    private List<String> openingClosingChannels;
    @Expose
    private List<ServiceBundle> serviceBundles;
    @Expose
    private TermsConditions termsConditions;
    @Expose
    private List<String> transactionMethods;
    @Expose
    private String type;

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Fees getFees() {
        return fees;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public List<IncomeRate> getIncomeRate() {
        return incomeRate;
    }

    public void setIncomeRate(List<IncomeRate> incomeRate) {
        this.incomeRate = incomeRate;
    }

    public List<String> getOpeningClosingChannels() {
        return openingClosingChannels;
    }

    public void setOpeningClosingChannels(List<String> openingClosingChannels) {
        this.openingClosingChannels = openingClosingChannels;
    }

    public List<ServiceBundle> getServiceBundles() {
        return serviceBundles;
    }

    public void setServiceBundles(List<ServiceBundle> serviceBundles) {
        this.serviceBundles = serviceBundles;
    }

    public TermsConditions getTermsConditions() {
        return termsConditions;
    }

    public void setTermsConditions(TermsConditions termsConditions) {
        this.termsConditions = termsConditions;
    }

    public List<String> getTransactionMethods() {
        return transactionMethods;
    }

    public void setTransactionMethods(List<String> transactionMethods) {
        this.transactionMethods = transactionMethods;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
