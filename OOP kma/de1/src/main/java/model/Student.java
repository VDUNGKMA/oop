/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author zung
 */
public class Student extends Person implements Serializable{
    private String id;
    private String email;
    private float score;

    public Student(String id, String email, float score, String name, String dateofbith, String address, String gender) {
        super(name, dateofbith, address, gender);
        this.id = id;
        this.email = email;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    public Object[] toObject(){
        
        return  new Object[]{this.id,this.email,this.score};
    }
    @Override
    public void showInfor() {
        super.showInfor(); 
        System.out.println("id: "+id);
        System.out.println("email: "+this.email);
        System.out.println("score: "+this.score);
    }

   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Student other = (Student) obj;
        return Objects.equals(this.id, other.id);
    }

   
    
    
}
