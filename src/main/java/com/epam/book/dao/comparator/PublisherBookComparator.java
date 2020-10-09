package com.epam.book.dao.comparator;

import com.epam.book.model.Book;

import java.util.Comparator;

public class PublisherBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {

        String publisherOne = bookOne.getPublisher();
        String publisherTwo = bookTwo.getPublisher();

        if ((publisherOne == null) && (publisherTwo != null)) {
            return -1;
        }

        if ((publisherOne != null) && (publisherTwo == null)) {
            return 1;
        }

        if ((publisherOne == null) && (publisherTwo == null)) {
            return 0;
        }

        return publisherOne.compareToIgnoreCase(publisherTwo);
    }

}