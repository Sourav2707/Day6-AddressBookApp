package com.bridgelabz.addressbookapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

public @Data class AddressBookDTO{
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Name invalid")
    public String name;
    @NotBlank(message = "Contact number shouldn't be blank")
    public String contactNo;
    @NotBlank(message = "EmailID shouldn't be blank")
    public String emailID;
    @NotBlank(message = "password shouldn't be blank")
    public String password;
    @NotBlank(message = "State shouldn't be blank")
    public String state;
    @NotBlank(message = "City shouldn't be blank")
    public String city;
    @NotBlank(message = "Zipcode shouldn't be blank")
    public String zipcode;
}
