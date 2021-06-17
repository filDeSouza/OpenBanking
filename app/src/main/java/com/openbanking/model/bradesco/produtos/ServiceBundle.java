
package com.openbanking.model.bradesco.produtos;

import java.util.List;
import com.google.gson.annotations.Expose;

public class ServiceBundle {

    @Expose
    private Maximum maximum;
    @Expose
    private Minimum minimum;
    @Expose
    private String name;
    @Expose
    private List<Price> prices;
    @Expose
    private List<Service> services;

    public Maximum getMaximum() {
        return maximum;
    }

    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
    }

    public Minimum getMinimum() {
        return minimum;
    }

    public void setMinimum(Minimum minimum) {
        this.minimum = minimum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

}
