package com.epam.book.dao.comparator;

import com.epam.book.model.Book;

import java.util.Comparator;

public class AuthorBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {

        String authorOne = bookOne.getAuthor();
        String authorTwo = bookTwo.getAuthor();

        if ((authorOne == null) && (authorTwo != null)) {
            return -1;
        }

        if ((authorOne != null) && (authorTwo == null)) {
            return 1;
        }

        if ((authorOne == null) && (authorTwo == null)) {
            return 0;
        }

        return authorOne.compareToIgnoreCase(authorTwo);
    }

}