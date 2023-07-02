package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressbookDataByID(int ID);
    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
    AddressBookData UpdateAddressBookData(AddressBookDTO addressBookDTO);
    void deleteAddressBookData(int ID);
}
