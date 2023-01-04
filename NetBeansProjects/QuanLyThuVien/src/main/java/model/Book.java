
package model;

import java.io.Serializable;


public class Book implements  Serializable{
    private static int currentID=9999;
    private int id;
    private  String bookname;
    private  String bookAuthor;
    private  String bookMajor;
    private  String bookYear ;
    private  int  bookAmount;

    public Book( String bookname, String bookAuthor, String bookMajor, String bookYear, int bookAmount) {
        this.id = ++currentID;
        this.bookname = bookname;
        this.bookAuthor = bookAuthor;
        this.bookMajor = bookMajor;
        this.bookYear = bookYear;
        this.bookAmount = bookAmount;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        Book.currentID = currentID;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public Object[] toObject(){
        return new Object[]{id,bookname,bookAuthor,bookMajor,bookYear,bookAmount};
    }
    @Override
    public boolean equals(Object obj) {
        if(this ==obj){
            return true;
        }
        if(obj instanceof Book){
            Book b= (Book)obj;
            if(this.bookAuthor.equals(b.bookAuthor)
            && this.bookname.equals(b.bookname)){
                return true;
            }
        }
        return false;
    }
}
