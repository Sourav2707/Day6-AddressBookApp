package com.bridgelabz.addressbookapp.exception;

import com.bridgelabz.addressbookapp.model.AddressBookData;

public class AddressBookException extends RuntimeException{
    public AddressBookException(String message) {
        super(message);
    }
}
