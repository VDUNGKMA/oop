
package Main;


public class Student {
    private String id;
    private String hoten;
    private int tuoi;

    public Student(String id, String hoten, int tuoi) {
        this.id = id;
        this.hoten = hoten;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", hoten=" + hoten + ", tuoi=" + tuoi + '}';
    }
    
}
