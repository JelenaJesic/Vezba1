
package media;


public class Television {

    private int volume;
    private int currentProgram;
    private boolean turnOn;

    public Television() {

        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = true;
    }
    
    public Television (int volume, int currentProgram, boolean turnOn){
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;
       
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getcurrentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int currentProgram){
        this.currentProgram = currentProgram;
    }

    public boolean getturnOn() {
        return this.turnOn;
    }
    
    public void turnOn (boolean turnOn){
        this.turnOn = turnOn;
    }
    
    
    public void showData() {
        System.out.println("Jacina televizora je:  " + getVolume());
        System.out.println("Trenutni program je: " + getcurrentProgram());
        System.out.println("Televizor je ukljucen:  "+ getturnOn());
        System.out.println();
    }
    
}
