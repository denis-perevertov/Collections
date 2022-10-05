package Behavioral.Command;

public class EBookReader implements BookSystem {


    @Override
    public void openBook() {
        System.out.println("Opening book on the e-book reader");
    }

    @Override
    public void closeBook() {
        System.out.println("Closing book");
    }

    @Override
    public void copyBook() {
        System.out.println("Book copied");
    }

    @Override
    public void pasteBook() {
        System.out.println("Book pasted");
    }

    @Override
    public void saveBook() {
        System.out.println("Book saved to Favorites");
    }
}
