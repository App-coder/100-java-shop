package com.shop.model;

public class ShopStoreGrade {
    private Integer sgId;

    private String sgName;

    private Integer sgGoodsLimit;

    private Integer sgSpaceLimit;

    private Byte sgTemplateNumber;

    private String sgTemplate;

    private String sgPrice;

    private Boolean sgConfirm;

    private String sgFunction;

    private Byte sgSort;

    private String sgDescription;

    public Integer getSgId() {
        return sgId;
    }

    public void setSgId(Integer sgId) {
        this.sgId = sgId;
    }

    public String getSgName() {
        return sgName;
    }

    public void setSgName(String sgName) {
        this.sgName = sgName == null ? null : sgName.trim();
    }

    public Integer getSgGoodsLimit() {
        return sgGoodsLimit;
    }

    public void setSgGoodsLimit(Integer sgGoodsLimit) {
        this.sgGoodsLimit = sgGoodsLimit;
    }

    public Integer getSgSpaceLimit() {
        return sgSpaceLimit;
    }

    public void setSgSpaceLimit(Integer sgSpaceLimit) {
        this.sgSpaceLimit = sgSpaceLimit;
    }

    public Byte getSgTemplateNumber() {
        return sgTemplateNumber;
    }

    public void setSgTemplateNumber(Byte sgTemplateNumber) {
        this.sgTemplateNumber = sgTemplateNumber;
    }

    public String getSgTemplate() {
        return sgTemplate;
    }

    public void setSgTemplate(String sgTemplate) {
        this.sgTemplate = sgTemplate == null ? null : sgTemplate.trim();
    }

    public String getSgPrice() {
        return sgPrice;
    }

    public void setSgPrice(String sgPrice) {
        this.sgPrice = sgPrice == null ? null : sgPrice.trim();
    }

    public Boolean getSgConfirm() {
        return sgConfirm;
    }

    public void setSgConfirm(Boolean sgConfirm) {
        this.sgConfirm = sgConfirm;
    }

    public String getSgFunction() {
        return sgFunction;
    }

    public void setSgFunction(String sgFunction) {
        this.sgFunction = sgFunction == null ? null : sgFunction.trim();
    }

    public Byte getSgSort() {
        return sgSort;
    }

    public void setSgSort(Byte sgSort) {
        this.sgSort = sgSort;
    }

    public String getSgDescription() {
        return sgDescription;
    }

    public void setSgDescription(String sgDescription) {
        this.sgDescription = sgDescription == null ? null : sgDescription.trim();
    }
}