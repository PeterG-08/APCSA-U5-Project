package transit;

public class Mercedes extends Transit {
    public Mercedes() {
        super("Mercedes", 100);

        addActions(this::lighton);
    }

    public void lighton() {
        log("Look at this shiny batman beam in the sphape of a mercedes logo!");
    }

    @Override
    public void doStunt() {
        log(" Hey look im gonna drift across this entire road.");
    }

    @Override
    public void makeSound() {
        log("honkkkkkkkk!");
    }

    public static void main(String[] args){
        Mercedes myMercedesTest = new Mercedes(); // id 0
        myMercedesTest.lighton();
        myMercedesTest.doStunt();
        myMercedesTest.makeSound();

        Mercedes myMercedesTest2 = new Mercedes(); // id 1
        myMercedesTest2.lighton();
    }
}