package com.example.demo.entity;

import lombok.Data;

/**
 * @author shenf
 * @date 2018/7/26 14:16
 */
@Data
public class Address {

    private Integer addressId;//主键

    private String address1;//地址1

    private String address2;//地址2

    private String city;//城市

    private String postalcode;//邮编
}
