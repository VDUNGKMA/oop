
public class Cat extends Animals{
    
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makesound() {
        System.out.println("meow meow");
    }

    @Override
    public void eat() {
        System.out.println("mam mam");
    }
    
}
