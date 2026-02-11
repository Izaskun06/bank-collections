package org.ies.tierno.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

@Data
@AllArgsConstructor
public class Library {
    private String name;
    private Map<String, Book> booksByIsbn;
    private List<Customer> customers;
    private TreeSet<BookLend> bookLends;

    public List<Book> findBooksByGenre(String genre) {
        List<Book> genreBooks = new ArrayList<>();
        for (Book book : booksByIsbn.values()) {
            if (book.getGenres().contains(genre)) {
                genreBooks.add(book);
            }
        }
        return genreBooks;
    }
}
