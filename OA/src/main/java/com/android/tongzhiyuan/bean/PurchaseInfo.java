package com.android.tongzhiyuan.bean;

import java.io.Serializable;

/**
 * Gool Lee
 * 报销
 */
public class PurchaseInfo implements Serializable {

    private int id;
    private String name;
    private String spec;//规格
    private String num;
    private String price;
    private String titleName;

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    private String unit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getNumber() {
        return num;
    }

    public void setNumber(String number) {
        this.num = number;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public PurchaseInfo(int id, String name, String spec, String number, String price) {

        this.id = id;
        this.name = name;
        this.spec = spec;
        this.num = number;
        this.price = price;
    }
}
