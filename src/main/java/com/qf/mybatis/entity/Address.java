package com.qf.mybatis.entity;

public class Address {
    /**
     * 地址id
     */
    private Integer addressId;

    /**
     * 收件人姓名
     */
    private String name;

    /**
     * 电话号
     */
    private Integer phone;

    /**
     * 地址
     */
    private String addr;

    /**
     * 0为未删除，1为已删除
     */
    private Integer status;
    private  User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

