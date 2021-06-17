
package com.openbanking.model.bradesco.dependencias;

import com.google.gson.annotations.Expose;


public class PostalAddress {

    @Expose
    private String additionalInfo;
    @Expose
    private String address;
    @Expose
    private String country;
    @Expose
    private String countryCode;
    @Expose
    private String countrySubDivision;
    @Expose
    private String districtName;
    @Expose
    private GeographicCoordinates geographicCoordinates;
    @Expose
    private String ibgeCode;
    @Expose
    private String postCode;
    @Expose
    private String townName;

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountrySubDivision() {
        return countrySubDivision;
    }

    public void setCountrySubDivision(String countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public GeographicCoordinates getGeographicCoordinates() {
        return geographicCoordinates;
    }

    public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
        this.geographicCoordinates = geographicCoordinates;
    }

    public String getIbgeCode() {
        return ibgeCode;
    }

    public void setIbgeCode(String ibgeCode) {
        this.ibgeCode = ibgeCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

}
