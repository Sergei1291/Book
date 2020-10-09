package com.epam.book.dao.comparator;

import com.epam.book.model.Book;

import java.util.Comparator;

public class TitleBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {

        String titleOne = bookOne.getTitle();
        String titleTwo = bookTwo.getTitle();

        if ((titleOne == null) && (titleTwo != null)) {
            return -1;
        }

        if ((titleOne != null) && (titleTwo == null)) {
            return 1;
        }

        if ((titleOne == null) && (titleTwo == null)) {
            return 0;
        }

        return titleOne.compareToIgnoreCase(titleTwo);
    }

}