package com.epam.book.dao.factory;

import com.epam.book.dao.comparator.*;
import com.epam.book.model.Book;

import java.util.Comparator;

public class ComparatorFactory {

    public Comparator<Book> create(BookField field) {

        switch (field) {
            case TITLE:
                return new TitleBookComparator();
            case AUTHORS:
                return new AuthorBookComparator();
            case PUBLISHER:
                return new PublisherBookComparator();
            case YEAR:
                return new YearBookComparator();
            case NUM_PAGES:
                return new NumPagesBookComparator();
            default:
                throw new IllegalArgumentException("incorrect Book's field" + field);
        }

    }

}