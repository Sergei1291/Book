package com.epam.book.dao.factory;

import com.epam.book.dao.specification.*;

public class SpecificationFactory {

    public AbstractSpecification create(BookField field) {

        switch (field) {
            case TITLE:
                return new TitleSpecification();
            case AUTHORS:
                return new AuthorSpecification();
            case PUBLISHER:
                return new PublisherSpecification();
            case YEAR:
                return new YearSpecification();
            case NUM_PAGES:
                return new NumPagesSpecification();
            default:
                throw new IllegalArgumentException("incorrect Book's field" + field);
        }

    }

}