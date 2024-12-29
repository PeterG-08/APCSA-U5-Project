package aircraft;

public class Cessna extends Aircraft {
    public Cessna() {
        super("Cessna", 200);

        addActions(this::spinPropeller);
    }

    public void spinPropeller() {
        log("Spinning propeller!");
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
