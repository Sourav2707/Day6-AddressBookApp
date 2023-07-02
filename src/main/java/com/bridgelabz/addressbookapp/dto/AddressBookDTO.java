package com.bridgelabz.addressbookapp.dto;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

public @Data class AddressBookDTO{
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Name invalid")
    public String name;
    public String contactNo;
    public String emailID;
    public String password;
    public String state;
    public String city;
    public String zipcode;
}
