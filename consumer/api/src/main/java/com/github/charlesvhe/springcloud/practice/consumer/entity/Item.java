package com.github.charlesvhe.springcloud.practice.consumer.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_id")
    private Long productId;
    private String name;
    private String description;
    private String imageurl;
    private String imagethumburl;
    private BigDecimal price;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "seller_contact_id")
    private Long sellerContactId;
    private Long totalscore;
    private Long numberofvotes;
    private Long disabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImagethumburl() {
        return imagethumburl;
    }

    public void setImagethumburl(String imagethumburl) {
        this.imagethumburl = imagethumburl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getSellerContactId() {
        return sellerContactId;
    }

    public void setSellerContactId(Long sellerContactId) {
        this.sellerContactId = sellerContactId;
    }

    public Long getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Long totalscore) {
        this.totalscore = totalscore;
    }

    public Long getNumberofvotes() {
        return numberofvotes;
    }

    public void setNumberofvotes(Long numberofvotes) {
        this.numberofvotes = numberofvotes;
    }

    public Long getDisabled() {
        return disabled;
    }

    public void setDisabled(Long disabled) {
        this.disabled = disabled;
    }
}
