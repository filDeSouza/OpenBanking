
package com.openbanking.model.bradesco.produtos;

import com.google.gson.annotations.Expose;


public class Links {

    @Expose
    private String first;
    @Expose
    private String last;
    @Expose
    private String next;
    @Expose
    private String prev;
    @Expose
    private String self;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

}
