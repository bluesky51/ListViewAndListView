package com.sky.sky.listviewandlistview.bean;

import java.io.Serializable;

/**
 * Created by BlueSky on 17/2/6.
 */

public class Product implements Serializable {


    /**
     * ID : 101
     * foodName : 巧克力101
     * foodPrice : 22.5
     * salesCount : 101
     * imageUrl : 1
     */

    private int ID;//商品id
    private String foodName;//商品名字
    private double foodPrice;//商品价格
    private int salesCount;//出售数量
    private String imageUrl;//商品图标地址
    private int seleteId;
    private String title;//商品分类名称


    public int getSeleteId() {
        return seleteId;
    }

    public void setSeleteId(int seleteId) {
        this.seleteId = seleteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
