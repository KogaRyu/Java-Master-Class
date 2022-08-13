public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " lol. FlWalks");
    }

    public void swim() {
        System.out.println(getName() + " very good swim-slider Mumble is :-)");
    }
}
