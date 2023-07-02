package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "addresbook")
public @Data class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "contactNo")
    private String contactNo;
    @Column(name = "emailID")
    private String emailID;
    @Column(name = "password")

    private String password;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "zipcode")
    private String zipcode;

    public AddressBookData() {

    }
    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateAddressBookData(addressBookDTO);
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
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
