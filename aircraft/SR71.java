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
    public static void main(String[]args){

        SR71 mySR71Test = new SR71(); // id 0
        mySR71Test.sonicBoom();
        mySR71Test.doStunt();
        mySR71Test.makeSound();

        SR71 mySR71Test2 = new SR71(); // id 1
        mySR71Test2.sonicBoom();


    }
    
}
