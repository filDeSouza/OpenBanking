
package com.openbanking.model.bradesco.dependencias;

import java.util.List;
import com.google.gson.annotations.Expose;


public class Company {

    @Expose
    private List<Branch> branches;
    @Expose
    private String cnpjNumber;
    @Expose
    private String name;
    @Expose
    private String urlComplementaryList;

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

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

    public String getUrlComplementaryList() {
        return urlComplementaryList;
    }

    public void setUrlComplementaryList(String urlComplementaryList) {
        this.urlComplementaryList = urlComplementaryList;
    }

}
