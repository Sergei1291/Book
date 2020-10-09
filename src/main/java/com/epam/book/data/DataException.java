package com.epam.book.data;

public class DataException extends Exception {

    public DataException(Exception exception) {

        super(exception);
    }

}