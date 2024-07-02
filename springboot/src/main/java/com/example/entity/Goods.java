package com.example.entity;

import java.io.Serializable;

/**
 * 宠物用品表
*/
public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    /** 商品名称 */
    private String name;
    /** 商品图片 */
    private String img;
    /** 商品价格 */
    private double price;
    /** 商品数量 */
    private Integer num;

    private Integer tmpNum = 1;

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
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getTmpNum() {
        return tmpNum;
    }

    public void setTmpNum(Integer tmpNum) {
        this.tmpNum = tmpNum;
    }
}