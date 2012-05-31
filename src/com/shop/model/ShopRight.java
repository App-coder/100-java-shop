package com.shop.model;

public class ShopRight {
    private Integer id;

    private String name;

    private String right;
    
    private int itemid;
    
    private int sno;
    
    private int _parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right == null ? null : right.trim();
    }


	public int get_parentId() {
		return _parentId;
	}

	public void set_parentId(int _parentId) {
		this._parentId = _parentId;
	}


	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
    
    
    
}