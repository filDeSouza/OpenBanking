
package com.openbanking.model.bradesco.dependencias;

import java.util.List;
import com.google.gson.annotations.Expose;

public class Branch {

    @Expose
    private Availability availability;
    @Expose
    private Identification identification;
    @Expose
    private List<Phone> phones;
    @Expose
    private PostalAddress postalAddress;
    @Expose
    private List<Service> services;

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

}
