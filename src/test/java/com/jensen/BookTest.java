package com.jensen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book("My Test Book",543,"Roy Jokob");
    @Test
    void testSetTitle() { book.setTitle("The Fundamentals of Testing"); }

    @Test
    void testSetPages() { book.setPages(456); }

    @Test
    void testSetAuthor() { book.setAuthor("Paul C, Robert Lee"); }

    @Test
    void testGetTitle() {
    book.getTitle();
    System.out.println(book.getTitle());
    }

    @Test
    void testBookAuthor() {
    book.getAuthor();
    System.out.println(book.getAuthor());
    }

}