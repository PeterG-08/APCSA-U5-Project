package person;

import aircraft.Aircraft;
import transit.Transit;

public class Tourist extends Person {
    private boolean obnoxiousness = false;

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
    
    public void changeMood() {
        obnoxiousness =true;
    }
    
    public boolean getMood() {
        return obnoxiousness;
    }
    
    public String printMood(boolean n){
        if (n==true){
            return "Best get away rom me today, im unhappy!";

        } else{return "how are you? what are you most excited about in this trip?";}
    }
    
    @Override
    public void doTask() {
        log("I am a tourist. I am taking pictures.");
    }

    @Override
    public void speak() {
        String dialogue =  aircraft != null ? "I can't wait to land in France!" : "I can't wait to get to the hotel!";

        log(dialogue);
    }
}
