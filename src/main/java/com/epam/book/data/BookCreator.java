package com.epam.book.data;

import com.epam.book.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCreator {

    private final BookParser bookParser;

    public BookCreator(BookParser bookParser) {

        this.bookParser = bookParser;
    }

    public List<Book> createBooks(List<String> lines) {

        List<Book> books = new ArrayList<Book>();

        for (String line : lines) {

            Book book = bookParser.parse(line);
            books.add(book);

        }

        return books;
    }

}