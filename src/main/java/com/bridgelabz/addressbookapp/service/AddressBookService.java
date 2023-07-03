package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookrepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

    @Autowired
    AddressBookrepository addressBookrepository;
    List<AddressBookData> addressBookDataList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookrepository.findAll();
    }

    @Override
    public AddressBookData getAddressbookDataByID(int id) {
        return addressBookrepository.findById(id).orElseThrow(() ->new AddressBookException("AddressBook with id "+id+" doesn't exist"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDTO);
        log.debug("Address data : "+addressBookData.toString());
        return addressBookrepository.save(addressBookData);
    }

    @Override
    public AddressBookData UpdateAddressBookData(int id, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressbookDataByID(id);
        addressBookData.updateAddressBookData(addressBookDTO);
        return addressBookrepository.save(addressBookData);
    }

    @Override
    public void deleteAddressBookData(int id) {

        AddressBookData addressBookData = this.getAddressbookDataByID(id);
        addressBookrepository.delete(addressBookData);
    }
    @Override
    public List<AddressBookData> getAddressBookByState(String state) {
        return addressBookrepository.findByState(state);
    }
}
