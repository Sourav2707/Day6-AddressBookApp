package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressBookrepository extends JpaRepository<AddressBookData, Integer> {
    @Query(value = "select * from addressbook where state = ?", nativeQuery = true)
    List<AddressBookData> findByState(String state);
}
