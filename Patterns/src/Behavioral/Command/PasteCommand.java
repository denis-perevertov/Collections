package Behavioral.Command;

public class PasteCommand implements Command {

    private BookSystem bookSystem;

    public PasteCommand(BookSystem bs) {
        bookSystem = bs;
    }

    @Override
    public void execute() {
        bookSystem.pasteBook();
    }

}
