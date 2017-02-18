package com.irelandlight.model;

import java.util.Date;

/**
 * Created by mac on 2016/12/3.
 */
public class Goods {
    private Long id;                //蛋糕id
    private Date createTime;        //创建时间
    private Date lastUpdate;        //最后更新时间
    private Integer visibility;     //表示是否已删除
    private Integer isPutaway;      //是否上架  0表示未上架，1表示上架
    private String name;            //蛋糕名称
    private String description;     //蛋糕描述
    private String perference;      //蛋糕偏好
    private String use;             //蛋糕用途
    private String taste;           //蛋糕口味
    private Integer quantity;       //库存
    private Integer saleCount;      //销售量
    private Integer weight;         //权重系数
    private Integer status;         //商品状态
    private double minPrice;        //商品的最小价格


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(Integer isPutaway) {
        this.isPutaway = isPutaway;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPerference() {
        return perference;
    }

    public void setPerference(String perference) {
        this.perference = perference;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", isPutaway=" + isPutaway +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", perference='" + perference + '\'' +
                ", use='" + use + '\'' +
                ", taste='" + taste + '\'' +
                ", quantity=" + quantity +
                ", saleCount=" + saleCount +
                ", weight=" + weight +
                ", status=" + status +
                ", minPrice=" + minPrice +
                '}';
    }
}
