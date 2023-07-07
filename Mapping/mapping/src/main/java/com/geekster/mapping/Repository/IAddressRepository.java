package com.geekster.mapping.Repository;

import com.geekster.mapping.model.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IAddressRepository extends CrudRepository<Address,Long> {
    @Transactional
    @Modifying
    @Query(value = "update Address where ADDRESS_ID=:addressId " ,nativeQuery = true)
    void updateAddressById(Long addressId);
}
