
public class Dog extends Animals{
    
    public Dog() {
        super("Dog");
    }

    @Override
    public void makesound() {
        System.out.println("gou gou"); 
    }

    @Override
    public void eat() {
        System.out.println("nham");
    }
    
}
