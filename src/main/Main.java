
package main;

import media.Radio;
import media.Television;

public class Main {
    
    public static void main(String[] args){
        
        Television myTelevision = new Television (5, 6, true);
        myTelevision.showData();
        
        myTelevision.setCurrentProgram(1);
        myTelevision.setVolume(8);
        myTelevision.showData();
        
        Radio myRadio = new Radio (98.6, 550, 'A');
        myRadio.showData();
        
        
    }
    
    
    
    
}
