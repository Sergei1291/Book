package com.epam.book.data;

import com.epam.book.model.Book;

public class BookParser {

    private final static String LINE_SEPARATOR = "\\s+";

    public Book parse(String line) {

        String[] fields = line.split(LINE_SEPARATOR);

        String title = fields[0];
        String author = fields[1];
        String publisher = fields[2];
        int year = Integer.parseInt(fields[3]);
        int numPages = Integer.parseInt(fields[4]);

        return new Book(title, author, publisher, year, numPages);
    }

}