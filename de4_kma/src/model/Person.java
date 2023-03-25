/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author zung
 */
public class Person {
    protected String name;
    protected String dateofbirth;
    protected String address;
   protected String gender;

    public Person(String name, String dateofbirth, String address, String gender) {
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
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
    public  void showinfor(){
        System.out.println("ho ten: "+this.name);
        System.out.println("ngay sinh: "+this.dateofbirth);
        System.out.println("dia chi: "+this.address);
        System.out.println("gioi tinh: "+this.gender);
    }
    public Object toObject(){
        return new Object[]{this.name,this.address};
    }
}
