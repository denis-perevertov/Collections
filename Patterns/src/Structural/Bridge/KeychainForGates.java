package Structural.Bridge;

public class KeychainForGates implements Keychain {

    Gate gate;

    KeychainForGates(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void upperButtonPress() {
        gate.open();
    }

    @Override
    public void middleButtonPress() {
        gate.lightSwitch();
    }

    @Override
    public void lowerButtonPress() {
        gate.close();
    }
}
