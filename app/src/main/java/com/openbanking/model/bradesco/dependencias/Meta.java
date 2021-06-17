
package com.openbanking.model.bradesco.dependencias;

import com.google.gson.annotations.Expose;


public class Meta {

    @Expose
    private Long totalPages;
    @Expose
    private Long totalRecords;

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

}
