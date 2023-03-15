
package model;

import java.io.Serializable;
import java.util.Objects;


public class Reader implements Serializable{
    private static int current_id=9999;
    private int id;
    private String name ,address,phoneNumber;

    public Reader() {
    }

    public Reader( String name, String address, String phoneNumber) {
        this.id = current_id++;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static int getCurrent_id() {
        return current_id;
    }

    public static void setCurrent_id(int current_id) {
        Reader.current_id = current_id;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Object[] toObject(){
        return new Object[]{id,name,address,phoneNumber};
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Reader other = (Reader) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.phoneNumber, other.phoneNumber);
    }
    
}
