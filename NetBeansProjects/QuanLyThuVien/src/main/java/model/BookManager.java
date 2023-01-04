
package model;

import java.io.Serializable;

public class BookManager  implements Serializable{
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
    public Object[] toObjects(){
        
        return new Object[]{book.getId(),book.getBookname(),reader.getId(),reader.getName(),amount};
        
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        } 
        if(obj instanceof BookManager){
            BookManager bm =(BookManager) obj;
            if(this.book.getId()==bm.book.getId()&& this.reader.getId()==bm.reader.getId()){
                return true;
            }
        }
        return false;
    }
    
}
