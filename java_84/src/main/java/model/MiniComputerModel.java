
package model;

public class MiniComputerModel {
    private double first_value;
    private double second_value;
    private double answer;

    public MiniComputerModel() {
    }

    public double getFirst_value() {
        return first_value;
    }

    public void setFirst_value(double first_value) {
        this.first_value = first_value;
    }

    public double getSecond_value() {
        return second_value;
    }

    public void setSecond_value(double second_value) {
        this.second_value = second_value;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
    public void plus(){
        this.answer=this.first_value+this.second_value;
    }
    public void minus(){
        this.answer=this.first_value-this.second_value;
    }
    public void multiply(){
        this.answer=this.first_value*this.second_value;
    }
    public void devide(){
        this.answer=this.first_value/this.second_value;
    }
    public void power(){
        this.answer=Math.pow(this.first_value, this.second_value);
    }
    public void mode(){
        this.answer=this.first_value %this.second_value;
    }
}