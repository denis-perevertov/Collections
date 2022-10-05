package Behavioral.Command;

public class OpenCommand implements Command {

    private BookSystem bookSystem;

    public OpenCommand(BookSystem bs) {
        bookSystem = bs;
    }

    @Override
    public void execute() {
        bookSystem.openBook();
    }
}
