package com.example.demo.service.serviceImpl;

import com.example.demo.dao.AddressDao;
import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shenf
 * @date 2018/7/26 14:19
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    public List<Address> getList() {
        return addressDao.list();
    }

    @Override
    public void saveAddress(Address address) {
        addressDao.saveAddress(address);
    }

    @Override
    public void deleteAddress(Address address) {
        addressDao.deleteAddress(address);
    }

    @Override
    public void updateAddress(Address address) {
        addressDao.updateAddress(address);
    }

    @Override
    public Address getAddress(Address address) {
        return addressDao.getAddress(address);
    }
}
