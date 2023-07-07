package com.geekster.mapping.Controller;

import com.geekster.mapping.Service.AddressService;
import com.geekster.mapping.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("/Address")
    public Iterable<Address> getAddress(){
        return addressService.getAddress();
    }
    @GetMapping(value = "/Address/AddressId/{addressId}")
    public Iterable<Address> getAllAddressById(@PathVariable Iterable<Long> addressId){
        return addressService.getAllAddressById(addressId);
    }
    @PostMapping("Address")
    public String addAddress(@RequestBody Address address){
        addressService.addAddress(address);
        return "Added";
    }
    @PostMapping("Address/All")
    public String addAllAddress(@RequestBody Iterable<Address> address){
        addressService.addAllAddress(address);
        return "Added";
    }
    @PutMapping("Address/{addressId}")
    public String updateAddressById(@PathVariable Long addressId){
        addressService.updateAddressById(addressId);
        return "updated";
    }
    @DeleteMapping("Address")
    public String deleteAddress(Address address){
        addressService.deleteAddress(address);
        return "Deleted";
    }
}
