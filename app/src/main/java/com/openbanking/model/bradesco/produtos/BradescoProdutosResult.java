
package com.openbanking.model.bradesco.produtos;

import com.google.gson.annotations.Expose;


public class BradescoProdutosResult {

    @Expose
    private Data data;
    @Expose
    private Links links;
    @Expose
    private Meta meta;

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

}
