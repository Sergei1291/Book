package com.epam.book.dao.comparator;

import com.epam.book.model.Book;

import java.util.Comparator;

public class NumPagesBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {

        int numPagesOne = bookOne.getNumPages();
        int numPagesTwo = bookTwo.getNumPages();

        return numPagesOne - numPagesTwo;
    }

}