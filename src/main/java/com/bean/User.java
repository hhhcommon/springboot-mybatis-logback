//package com.bean;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
///**
// * Desciption
// * Create By  li.bo
// * CreateTime 2017/7/25 10:55
// * UpdateTime 2017/7/25 10:55
// */
//@Component
//@ConfigurationProperties(prefix="user")
//public class User {
//
//    private @Value("${name:patrick}") String name;
//    private @Value("${age}") Integer age;
//    private String address;
//    private Address detailAddress;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Address getDetailAddress() {
//        return detailAddress;
//    }
//
//    public void setDetailAddress(Address detailAddress) {
//        this.detailAddress = detailAddress;
//    }
//}
