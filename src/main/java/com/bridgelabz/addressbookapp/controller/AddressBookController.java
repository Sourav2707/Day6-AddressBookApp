package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * ResponseEntity represents the whole HTTP response, status code, header and body.
 * Here we use ResponseEntity to display the HTTP status code.
 */
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Sourav", "8667642258"));
        ResponseDTO responseDTO = new ResponseDTO("Get call Success", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/get/{empID}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("empID") int empID) {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Hari", "8667617251"));
        ResponseDTO responseDTO = new ResponseDTO("Get call Success", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created AddressBook Data Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated AddressBook Data Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empID}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("empID") int ID) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted ID : "+ID);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
