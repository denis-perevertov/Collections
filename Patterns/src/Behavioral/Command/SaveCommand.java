package Behavioral.Command;

public class SaveCommand implements Command {

    private BookSystem bookSystem;

    public SaveCommand(BookSystem bs) {
        bookSystem = bs;
    }

    @Override
    public void execute() {
        bookSystem.saveBook();
    }

}
