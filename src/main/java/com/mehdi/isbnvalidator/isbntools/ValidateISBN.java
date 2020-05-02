package com.mehdi.isbnvalidator.isbntools;

public class ValidateISBN {

    public Boolean isValidISBN(String isbn) {

        if(isbn.length() !=10 )
            throw  new NumberFormatException("Isbn number must be 10 digit long");

            int total=0;
            for (int i=0 ;i<10 ;i++ ){
                if (!Character.isDigit(isbn.charAt(i))){
                    if ((i == 9) && (isbn.charAt(i) == 'X')) {
                        total +=10;
                    }else{
                        throw  new NumberFormatException("Isbn should be digit");
                    }
                }

                total += Character.getNumericValue(isbn.charAt(i)) * (10-i);
            }
            return (total % 11 == 0) ?true:false ;

    }
}
