package person;

import aircraft.Aircraft;
import aircraft.Transit;

public class Tourist extends Person{
    private boolean obnoxiousness= false;
    public Tourist(String name, Aircraft aircraft) {
        super(name, "Tourist", aircraft);

        addActions(this::shove);
    }
    public Tourist(String name, Transit aircraft) {
        super(name, "Tourist", aircraft);

        addActions(this::shove);
    }


    public void shove () {
        log("Hey! I'm Walkin here!!");
    }
    public void changeMood(){
        obnoxiousness =true;
    }
    public boolean getMood(){
        return obnoxiousness;
    }
    public String PrintMood(boolean n){
        if (n==true){
            return "Best get away rom me today, im unhappy!";

        }else{return "how are you? what are you most excited about in this trip?";}
    }
    @Override
    public void doTask() {
        log("I am a tourist. What how in the world did you hear terrorist?!");
    }

    @Override
    public void speak() {
        log("Can this pilot go any fater, I want to see (insert tourist attraction here) already!");
    }
    public void logStatus() {
        log("Status - I am a " + type + " on a " + Transit.name + " and" + (isHungry ? " I am hungry." : " I am not hungry."));
    }
}
