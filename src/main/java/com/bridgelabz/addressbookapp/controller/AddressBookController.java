package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.addressbookapp.service.IAddressBookService;

import java.util.List;

/**
 * ResponseEntity represents the whole HTTP response, status code, header and body.
 * Here we use ResponseEntity to display the HTTP status code.
 */
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    IAddressBookService addressBookService;
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addressBookDataList = addressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("Get call Success", addressBookDataList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/get/{empid}")
    public ResponseEntity<ResponseDTO> getAddressBookDataByid(@PathVariable("empid") int id) {
        AddressBookData addressBookData = addressBookService.getAddressbookDataByID(id);
        ResponseDTO responseDTO = new ResponseDTO("Get call Success", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created AddressBook Data Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@Valid @PathVariable("id") int id, @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.UpdateAddressBookData(id, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated AddressBook Data Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id) {
        addressBookService.deleteAddressBookData(id);
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted id : "+id);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/get/{state}")
    public ResponseEntity<ResponseDTO> getAddressBookByState(@PathVariable("state") String state) {
        List<AddressBookData> addressByState = addressBookService.getAddressBookByState(state);
        ResponseDTO responseDTO = new ResponseDTO("Get call Success", addressByState);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
