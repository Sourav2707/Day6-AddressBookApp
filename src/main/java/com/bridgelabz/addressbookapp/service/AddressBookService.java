package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    AddressBookrepository addressBookrepository;
    List<AddressBookData> addressBookDataList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressbookDataByID(int id) {
        return addressBookDataList.stream().filter(employeeData -> employeeData.getId() == id).findFirst().orElseThrow(() ->new AddressBookException("AddressBook Not Found"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDataList.size()+1, addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookrepository.save(addressBookData);
    }

    @Override
    public AddressBookData UpdateAddressBookData(int id, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressbookDataByID(id);
        addressBookData.setName(addressBookDTO.getName());
        addressBookData.setContactNo(addressBookDTO.getContactNo());
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int id) {
        addressBookDataList.remove(id-1);
    }
}
