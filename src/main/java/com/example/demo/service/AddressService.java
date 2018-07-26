package com.example.demo.service;

import com.example.demo.entity.Address;

import java.util.List;

/**
 * 地址service类
 * @author shenf
 * @date 2018/7/26 14:18
 */
public interface AddressService {

    List<Address> getList();

    void saveAddress(Address address);

    void deleteAddress(Address address);

    void updateAddress(Address address);

    Address getAddress(Address address);
}
