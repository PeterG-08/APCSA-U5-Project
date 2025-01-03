package aircraft;

public class Mercedes extends Transit{
    public Mercedes() {
        super("Cybertruck", 122);

        addActions(this::openDoor);
    }

    public void openDoor() {
        log("Automatic door open!");
    }

    @Override
    public void doStunt() {
        log(" watch this!(drives through a wall)");
    }

    @Override
    public void makeSound() {
        log("honk!");

    }
}