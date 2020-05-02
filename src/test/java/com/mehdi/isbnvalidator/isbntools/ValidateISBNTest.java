package com.mehdi.isbnvalidator.isbntools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateISBNTest {

    @Test
    public void IsValidISBN_validISBN_true(){
        ValidateISBN validateISBN = new ValidateISBN();
        Boolean result = validateISBN.isValidISBN("0321349601");
        assertTrue(result);
    }
    @Test
    public void IsValidISBN_ValidISBNEndingInAnX_true(){
        ValidateISBN validateISBN = new ValidateISBN();
        Boolean result = validateISBN.isValidISBN("012000030X");
        assertTrue(result);
    }
    @Test
    public void IsValidISBN_InValidISBN_false(){

        ValidateISBN validateISBN = new ValidateISBN();
        Boolean result = validateISBN.isValidISBN("0321349604");
        assertFalse(result);
    }
    @Test()
    public void IsValidISBN_9DigitISBN_NumberFormatException(){

        ValidateISBN validateISBN = new ValidateISBN();
        Assertions.assertThrows(NumberFormatException.class, () -> {
            validateISBN.isValidISBN("123456789");
        });
    }
    @Test()
    public void IsValidISBN_NonNumericISBN_NumberFormatException(){

        ValidateISBN validateISBN = new ValidateISBN();
        Assertions.assertThrows(NumberFormatException.class, () -> {
            validateISBN.isValidISBN("HelloWorld");
        });
    }

}