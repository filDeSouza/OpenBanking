
package com.openbanking.model.bradesco.produtos;

import com.google.gson.annotations.Expose;


public class IncomeRate {

    @Expose
    private String prepaidPaymentAccount;
    @Expose
    private String savingAccount;

    public String getPrepaidPaymentAccount() {
        return prepaidPaymentAccount;
    }

    public void setPrepaidPaymentAccount(String prepaidPaymentAccount) {
        this.prepaidPaymentAccount = prepaidPaymentAccount;
    }

    public String getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(String savingAccount) {
        this.savingAccount = savingAccount;
    }

}
