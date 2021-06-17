
package com.openbanking.model.bradesco.produtos;

import java.util.List;
import com.google.gson.annotations.Expose;

public class Company {

    @Expose
    private String cnpjNumber;
    @Expose
    private String name;
    @Expose
    private List<PersonalAccount> personalAccounts;
    @Expose
    private String urlComplementaryList;

    public String getCnpjNumber() {
        return cnpjNumber;
    }

    public void setCnpjNumber(String cnpjNumber) {
        this.cnpjNumber = cnpjNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PersonalAccount> getPersonalAccounts() {
        return personalAccounts;
    }

    public void setPersonalAccounts(List<PersonalAccount> personalAccounts) {
        this.personalAccounts = personalAccounts;
    }

    public String getUrlComplementaryList() {
        return urlComplementaryList;
    }

    public void setUrlComplementaryList(String urlComplementaryList) {
        this.urlComplementaryList = urlComplementaryList;
    }

}
