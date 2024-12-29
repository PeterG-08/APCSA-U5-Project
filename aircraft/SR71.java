package aircraft;

public class SR71 extends Aircraft {
    public SR71() {
        super("SR71", 2000);

        addActions(this::sonicBoom);
    }

    public void sonicBoom() {
        log("SONIC BOOM!");
    }

    @Override
    public void doStunt() {
        log("Doing a loop!");
    }

    @Override
    public void makeSound() {
        log("Zoom zoom!");
    }
    
}
