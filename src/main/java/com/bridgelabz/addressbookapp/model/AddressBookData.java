package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

@Data
public class AddressBookData {
    private int id;
    private String name;
    private String contactNo;

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.name = addressBookDTO.getName();
        this.contactNo = addressBookDTO.getContactNo();
    }
}
