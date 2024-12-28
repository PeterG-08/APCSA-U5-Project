package util;
public class Logged {
    protected String logName;

    public Logged() {}

    public void log(String text) {
        System.out.println("[" + logName + "]: " + text);
    }
}
