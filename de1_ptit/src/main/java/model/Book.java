
package model;

import java.io.Serializable;
import java.util.Objects;


public class Book implements Serializable { //doc ghi file
    private static int current_id=9999;
    private int id;
    private String bookName;
    private String bookAuthor, bookMajor,bookYear;
    private int bookAmount;

    public Book() {
    }
    
    public Book( String bookName, String bookAuthor, String bookMajor, String bookYear, int bookAmount) {
        this.id = current_id++;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookMajor = bookMajor;
        this.bookYear = bookYear;
        this.bookAmount = bookAmount;
    }

    public static int getCurrent_id() {
        return current_id;
    }

    public static void setCurrent_id(int current_id) {
        Book.current_id = current_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookMajor() {
        return bookMajor;
    }

    public void setBookMajor(String bookMajor) {
        this.bookMajor = bookMajor;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public int getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(int bookAmount) {
        this.bookAmount = bookAmount;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookMajor=" + bookMajor + ", bookYear=" + bookYear + ", bookAmount=" + bookAmount + '}';
    }
    public Object[] toObject(){
        return new Object[]{id,bookName,bookAuthor,bookMajor,bookYear,bookAmount};
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
        final Book other = (Book) obj;
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.bookAuthor, other.bookAuthor)) {
            return false;
        }
        return Objects.equals(this.bookMajor, other.bookMajor);
    }
    
}
