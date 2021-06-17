
package com.openbanking.model.bradesco.dependencias;

import java.util.List;
import com.google.gson.annotations.Expose;

public class Brand {

    @Expose
    private List<Company> companies;
    @Expose
    private String name;

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
