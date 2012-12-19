package com.shop.model;

import java.io.Serializable;

public class ShopGuide implements Serializable{
	private static final long serialVersionUID = 4554269404086482980L;

	private Integer order;

    private String name;

    private String link;

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }
}