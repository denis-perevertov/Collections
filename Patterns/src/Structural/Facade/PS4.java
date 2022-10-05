package Structural.Facade;

public class PS4 {

    public boolean state;
    public int joystickCount;

    PS4(int joystickCount){
        state = false;
        this.joystickCount = joystickCount;
    }

    public void power(){
        if (!state) {
            state = true;
            System.out.println("Turned On PS4");
        }
        else {
            state = false;
            System.out.println("Turned Off PS4");
        }
    }

    public void play() {
        if(state) System.out.println("Playing games for " + joystickCount + " people");
        else System.out.println("PS4 is not switched on");
    }

}
