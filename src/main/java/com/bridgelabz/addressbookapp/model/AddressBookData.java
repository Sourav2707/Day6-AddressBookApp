package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

@Data
public class AddressBookData {
    private int id;
    private String name;
    private String contactNo;
    private String emailID;
    private String password;
    private String state;
    private String city;
    private String zipcode;

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.name = addressBookDTO.getName();
        this.contactNo = addressBookDTO.getContactNo();
        this.emailID = addressBookDTO.getEmailID();
        this.password = addressBookDTO.getPassword();
        this.state = addressBookDTO.getState();
        this.city = addressBookDTO.getCity();
        this.zipcode = addressBookDTO.getZipcode();
    }
}
