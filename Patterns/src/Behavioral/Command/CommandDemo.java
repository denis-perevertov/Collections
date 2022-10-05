package Behavioral.Command;

public class CommandDemo {

    public static void main(String[] args) {

        BookSystem eBook_reader = new EBookReader();

        Command openCommand = new OpenCommand(eBook_reader);
        Command closeCommand = new CloseCommand(eBook_reader);
        Command pasteCommand = new PasteCommand(eBook_reader);
        Command copyCommand = new CopyCommand(eBook_reader);
        Command saveCommand = new SaveCommand(eBook_reader);

        Invoker invoker = new Invoker(openCommand);

        invoker.execute();

        invoker.setCommand(closeCommand);

        invoker.execute();

        invoker.setCommand(copyCommand);

        invoker.execute();

        invoker.setCommand(pasteCommand);

        invoker.execute();

        invoker.setCommand(saveCommand);

        invoker.execute();

    }


        




}
