package com.example.promotionengine.model;

public class Promotion {

    private String promotionName;
    private String promotionCode;
    private String promotionDescription;
    private Boolean isActive;
    private Schedule schedule;
    private Qualification qualifyingCondition;
    private Qualification targetItems;
    private DiscountRule discountRule;
    private String[] countries;
    private Integer redemptionLimit;
    private Integer priority;
    private Customer customerContext;

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getPromotionDescription() {
        return promotionDescription;
    }

    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Qualification getQualifyingCondition() {
        return qualifyingCondition;
    }

    public void setQualifyingCondition(Qualification qualifyingCondition) {
        this.qualifyingCondition = qualifyingCondition;
    }

    public Qualification getTargetItems() {
        return targetItems;
    }

    public void setTargetItems(Qualification targetItems) {
        this.targetItems = targetItems;
    }

    public DiscountRule getDiscountRule() {
        return discountRule;
    }

    public void setDiscountRule(DiscountRule discountRule) {
        this.discountRule = discountRule;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    public Integer getRedemptionLimit() {
        return redemptionLimit;
    }

    public void setRedemptionLimit(Integer redemptionLimit) {
        this.redemptionLimit = redemptionLimit;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Customer getCustomerContext() {
        return customerContext;
    }

    public void setCustomerContext(Customer customerContext) {
        this.customerContext = customerContext;
    }
}
