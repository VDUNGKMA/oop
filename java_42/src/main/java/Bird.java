
public class Bird extends Animals{
    
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makesound() {
        System.out.println("liu lo");    }

    @Override
    public void eat() {
        System.out.println("chit chit");
    }
    
}
