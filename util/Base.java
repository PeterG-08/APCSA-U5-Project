package util;

import java.util.ArrayList;
import java.util.List;

public abstract class Base {
    protected String logName;
    protected List<Runnable> actions = new ArrayList<>();

    public Base() {}

    /** Adds actions to this class. */
    public void addActions(Runnable... actions) {
        this.actions.addAll(List.of(actions));
    }

    /** Runs a random action of this class. */
    public void randomAction() {
        actions.get((int) (Math.random() * actions.size())).run();
    }

    public void log(String text) {
        System.out.println("[" + logName + "] " + text);
    }

    public abstract void logStatus();
}
