package com.bridgelabz.addressbookapp.dto;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

public @Data class AddressBookDTO{
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Name invalid")
    private String name;
    private String contactNo;
    @Override
    public String toString() {
        return "name ="+name+" : Contact no ="+contactNo;
    }
}
