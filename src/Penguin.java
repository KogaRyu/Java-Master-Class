public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("lol. " + getName() + " can only FlWalks");
    }

    public void swim() {
        System.out.println(getName() + " very good SwimSlider Mumble is :-)");
    }
}
