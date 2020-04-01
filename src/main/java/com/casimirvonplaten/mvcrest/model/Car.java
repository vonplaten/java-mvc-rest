package com.casimirvonplaten.mvcrest.model;

public class Car{
    private int cid;
    private String model;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car [cid=" + cid + ", model=" + model + "]";
    }

    
}