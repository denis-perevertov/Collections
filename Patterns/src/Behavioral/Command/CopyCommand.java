package Behavioral.Command;

public class CopyCommand implements Command {

    private BookSystem bookSystem;

    public CopyCommand(BookSystem bs) {
        bookSystem = bs;
    }

    @Override
    public void execute() {
        bookSystem.copyBook();
    }

}
