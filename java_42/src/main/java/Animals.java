
public class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("toi dang an...");
    }
    public void makesound(){
        System.out.println(".............");
    }
    public void sleep(){
        System.out.println("zzzzzzzzzzzzzzz");
    }
}
