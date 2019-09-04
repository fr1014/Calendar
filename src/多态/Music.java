package 多态;

enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}

class Instrument{
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
}

class Wind extends Instrument{
    public void play(Note n){
        System.out.println("wind.play() "+n);
    }
}

public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
