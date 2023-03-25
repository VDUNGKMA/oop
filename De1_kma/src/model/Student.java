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
public class Student extends Person{
    private String id;
    private String email;
    private float score;
    private  String cbox;

    public Student( String name, String dateofbirth, String address, String gender,String id, String email, float score,String cbox) {
        super(name, dateofbirth, address, gender);
        this.id = id;
        this.email = email;
        this.score = score;
        this.cbox=cbox;
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

    @Override
    public void showinfor() {
        super.showinfor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("id: "+this.id);
        System.out.println("email: "+this.email);
        System.out.println("score: "+this.score);
    }
    
}
