package com.example.demo.controller;

import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 地址Controller类
 * @author shenf
 * @date 2018/7/26 14:08
 */
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    //地址列表
    @RequestMapping(value = "/address/list", method = RequestMethod.POST)
    public List<Address> getAddressList() {
        List<Address> addressList = addressService.getList();
        return addressList;
    }

    //新增地址
    @RequestMapping(value = "/address/save", method = RequestMethod.POST)
    public void save(@RequestBody Address address){
        addressService.saveAddress(address);
    }

    //删除地址
    @RequestMapping(value = "/address/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Address address){
        addressService.deleteAddress(address);
    }

    //修改地址
    @RequestMapping(value = "/address/update", method = RequestMethod.POST)
    public void update(@RequestBody Address address){
        addressService.updateAddress(address);
    }

    //查看地址
    @RequestMapping(value = "/address/get", method = RequestMethod.POST)
    public Address getAddress(@RequestBody Address address){
        return addressService.getAddress(address);
    }
}
