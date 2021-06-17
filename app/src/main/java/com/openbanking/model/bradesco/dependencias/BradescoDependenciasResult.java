
package com.openbanking.model.bradesco.dependencias;

import com.google.gson.annotations.Expose;

import java.util.List;


public class BradescoDependenciasResult {

    @Expose
    private Data data;
    @Expose
    private Links links;
    @Expose
    private Meta meta;

    @Expose
    private List<Branch> resultBranch;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Branch> getResultBranch() {
        return resultBranch;
    }

    public void setResultBranch(List<Branch> resultBranch) {
        this.resultBranch = resultBranch;
    }
}
