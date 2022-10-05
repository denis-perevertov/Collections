package Structural.Bridge;

import java.util.ArrayList;

public class KeychainForAlarm implements Keychain {

    Gate gate;

    KeychainForAlarm(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void upperButtonPress() {
        gate.setAlarm();
    }

    @Override
    public void middleButtonPress() {
        gate.lightSwitch();
    }

    @Override
    public void lowerButtonPress() {
        gate.removeAlarm();
    }

}
