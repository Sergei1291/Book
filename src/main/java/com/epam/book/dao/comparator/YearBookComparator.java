package com.epam.book.dao.comparator;

import com.epam.book.model.Book;

import java.util.Comparator;

public class YearBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {

        int yearOne = bookOne.getYear();
        int yearTwo = bookTwo.getYear();

        return yearOne - yearTwo;
    }

}