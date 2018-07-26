package com.example.demo.dao;

import com.example.demo.entity.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shenf
 * @date 2018/7/26 14:24
 */
@Repository
public interface AddressDao {
    List<Address> list();

    void saveAddress(Address address);

    void deleteAddress(Address address);

    void updateAddress(Address address);

    Address getAddress(Address address);
}
