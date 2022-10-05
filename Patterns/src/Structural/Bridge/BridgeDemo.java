package Structural.Bridge;

import java.util.ArrayList;
import java.util.List;

public class BridgeDemo {


    public static void main(String[] args) {

        Gate frontGate = new FrontGate("V.FGt",2);
        Gate parkingGate = new ParkingGate("H.PGt",3);
        Gate backGate = new BackGate("H.BkGt");

        Keychain frontGateOpenChain = new KeychainForGates(frontGate);
        Keychain parkingGateOpenChain = new KeychainForGates(parkingGate);
        Keychain backGateOpenChain = new KeychainForGates(backGate);

        Keychain frontGateAlarmChain = new KeychainForAlarm(frontGate);
        Keychain parkingGateAlarmChain = new KeychainForAlarm(parkingGate);
        Keychain backGateAlarmChain = new KeychainForAlarm(backGate);

        testDevice(frontGateOpenChain);
        testDevice(parkingGateOpenChain);
        testDevice(backGateOpenChain);
        testDevice(frontGateAlarmChain);
        testDevice(parkingGateAlarmChain);
        testDevice(backGateAlarmChain);

    }

    public static void testDevice(Keychain keychain) {

        keychain.upperButtonPress();

        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("");

        keychain.lowerButtonPress();

        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("");

        keychain.middleButtonPress();

        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("");

    }

}
