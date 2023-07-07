package com.geekster.mapping.Service;

import com.geekster.mapping.Repository.IAddressRepository;
import com.geekster.mapping.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepository addressRepository;

    public Iterable<Address> getAddress() {
        return addressRepository.findAll();
    }

    public Iterable<Address> getAllAddressById(Iterable<Long> addressId) {
        return addressRepository.findAllById(addressId);
    }

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public void addAllAddress(Iterable<Address> address) {
        addressRepository.saveAll(address);
    }

    public void deleteAddress(Address address) {
        addressRepository.delete(address);
    }

    public void updateAddressById(Long addressId) {
        addressRepository.updateAddressById(addressId);
    }
}
