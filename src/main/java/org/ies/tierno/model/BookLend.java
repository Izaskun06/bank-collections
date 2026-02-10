package org.ies.tierno.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BookLend implements Comparable<BookLend> {
    private String isbn;
    private LocalDate date;
    private String nif;

    @Override
    public int compareTo(BookLend o) {
        int compare = date.compareTo(o.date);
        if (compare == 0) {
            compare = isbn.compareTo(o.isbn);
            if (compare == 0) {
                compare = nif.compareTo(o.nif);
            }
        }
        return compare;
    }
}
