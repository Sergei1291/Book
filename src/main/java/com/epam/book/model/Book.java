package com.epam.book.model;

public class Book {

    private final String title;
    private final String author;
    private final String publisher;
    private final int year;
    private final int numPages;

    public Book(String title, String author, String publisher, int year, int numPages) {

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numPages = numPages;

    }

    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    public String getPublisher() {

        return publisher;
    }

    public int getYear() {

        return year;
    }

    public int getNumPages() {

        return numPages;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + numPages;
        result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null) {
                return false;
            }
        } else if (!author.equals(other.author)) {
            return false;
        }
        if (numPages != other.numPages)
            return false;
        if (publisher == null) {
            if (other.publisher != null) {
                return false;
            }
        } else if (!publisher.equals(other.publisher)) {
            return false;
        }
        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }
        if (year != other.year) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [title=" + title + ", author=" + author + ", publisher="
                + publisher + ", year=" + year + ", numPages=" + numPages + "]";
    }

}