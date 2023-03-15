
package model;

import java.util.Objects;

public class BookManager {
    private Book book;
    private Reader reader;
    private int amount;

    public BookManager() {
    }

    public BookManager(Book book, Reader reader, int amount) {
        this.book = book;
        this.reader = reader;
        this.amount = amount;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Object[] toObject(){
        return new Object[]{book.getId(),book.getBookName(),reader.getId(),reader.getName(),amount};
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        final BookManager other = (BookManager) obj;
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        return Objects.equals(this.reader, other.reader);
    }

    
}
    
