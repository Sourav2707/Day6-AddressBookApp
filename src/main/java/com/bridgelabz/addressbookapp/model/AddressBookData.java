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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
