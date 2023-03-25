
package model;

import java.io.Serializable;
import java.util.Objects;


public class Person implements Serializable{
    private String name;
    private   String dateofbith;
    private String address;
    private String gender;

    public Person(String name, String dateofbith, String address, String gender) {
        this.name = name;
        this.dateofbith = dateofbith;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbith() {
        return dateofbith;
    }

    public void setDateofbith(String dateofbith) {
        this.dateofbith = dateofbith;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void showInfor(){
        System.out.println("Name: "+this.name);
                System.out.println("Date of birth: "+this.dateofbith);
        System.out.println("Address: "+this.address);
        System.out.println("Gender: "+this.gender);

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.dateofbith);
        hash = 97 * hash + Objects.hashCode(this.address);
        hash = 97 * hash + Objects.hashCode(this.gender);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.dateofbith, other.dateofbith)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.gender, other.gender);
    }
    
    
}
