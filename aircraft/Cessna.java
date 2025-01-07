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
    public static void main(String[]args){

        Cessna myCessnaTest = new Cessna(); // id 0 
        myCessnaTest.spinPropeller();
        myCessnaTest.doStunt();
        myCessnaTest.makeSound();

        Cessna myCessnaTest2 = new Cessna(); // id 1
        myCessnaTest2.spinPropeller();
        
    }
}
