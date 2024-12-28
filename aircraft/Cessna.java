package aircraft;

public class Cessna extends Aircraft {
    public Cessna() {
        super("Cessna", 200);
    }

    @Override
    public void doStunt() {
        log("Doing a barrel roll!");
    }

    @Override
    public void makeSound() {
        log("Vroom vroom!");
    }
}
