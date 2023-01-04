
package model;

import java.io.Serializable;

public class Reader implements Serializable{
    private static int currentID=9999;
    private int id;
    private String name,address, phonenumber; 

    public Reader() {
    }

    public Reader(String name, String address, String phonenumber) {
        this.id = ++currentID;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }
    
    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        Reader.currentID = currentID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public Object[] toObject(){
        return new Object[]{id,name,address,phonenumber};
    }

    @Override
    public boolean equals(Object obj) {
        if(this ==obj){
            return true;
        }
        if(obj instanceof Reader){
            Reader r= (Reader)obj;
            if(this.name.equals(r.name) && this.address.equals(r.address)
            && this.phonenumber.equals(r.phonenumber)){
                return true;
            }
        }
        return false;
    }
    
}
