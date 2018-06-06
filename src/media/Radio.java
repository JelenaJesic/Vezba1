package media;

public class Radio {

    private double fmFrequency;
    private int amFrequency;
    private char band;

    public Radio(double fmFrequency, int amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;

    }

    public double getFmFrequency() {
        return this.fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public int getAmFrequency() {
        return this.amFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }

    public int getBand() {
        return this.band;
    }

    public void setBand(char band) {
        this.band = band;
    }

     public void showData() {
        System.out.println("Trenutna FM frekvencija je: " + getFmFrequency());
        System.out.println("Trenutna AM frekvencija je: " + getAmFrequency());
        System.out.println("Radio je trenutno na frekvenciji: "+ getBand());
        System.out.println();
    }
    
    
    
}
