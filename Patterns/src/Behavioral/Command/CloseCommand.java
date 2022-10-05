package Behavioral.Command;

public class CloseCommand implements Command {

    private BookSystem bookSystem;

    public CloseCommand(BookSystem bs) {
        bookSystem = bs;
    }

    @Override
    public void execute() {
        bookSystem.closeBook();
    }
}
