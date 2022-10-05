package Architectural.MVP;

public class Demo2 {

    public static void main(String[] args) {

        MyPresenter presenter;

        MyModel model = new MyModel();

        presenter = new MyPresenter(model);
        presenter.setView(new LogView(presenter));
    }
}
