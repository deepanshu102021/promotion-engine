package com.example.promotionengine.model;

public class Qualification {

    private String[] itemNo;
    private Integer min;
    private Integer max;
    private String type;

    public String[] getItemNo() {
        return itemNo;
    }

    public void setItemNo(String[] itemNo) {
        this.itemNo = itemNo;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
