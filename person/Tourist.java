package person;

import aircraft.Aircraft;

public class Tourist extends Person{
    private boolean obnoxiousness= false;
    public Tourist(String name, Aircraft aircraft) {
        super(name, "Tourist", aircraft);


    }
    public void shove () {
        log("H! I'm Walkin here!!");
    }

    @Override
    public void doTask() {
        log("I am a tourist. What how in the world did you hear terrorist?!");
    }

    @Override
    public void speak() {
        log("Can this pilot go any fater, I want to see (insert tourist attraction here) already!");
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
}
