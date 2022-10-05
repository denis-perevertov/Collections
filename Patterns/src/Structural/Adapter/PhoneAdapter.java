package Structural.Adapter;

public class PhoneAdapter implements Phone {

    Computer computer;

    PhoneAdapter(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void playMobileGames() {
        System.out.println("Downloading emulator to play mobile games...");
        computer.playGames();
    }

    @Override
    public void call() {
        System.out.println("Computer can't call a mobile phone directly...");
        System.out.println("Executing Telegram video-call");
        computer.telegramCall();
    }

    @Override
    public void listenToMusic() {
        computer.listenToMusic();
    }

    @Override
    public void unlock() {
        throw new UnsupportedOperationException("Computers have no fingerprint unlock function");
    }
}
