package Architectural.MVP;

public class MyPresenter {

    public MyModel model;
    public ViewActions view;

    public MyPresenter(MyModel model){
        this.model = model;
    }

    public MyPresenter(MyModel model, ViewActions view) {
        this.model = model;
        this.view = view;
    }

    public void addCustomer(MyModel.Customer customer) {
        model.add(customer);
        view.update();
    }

    public void update() {
        view.update();
    }

    public MyModel getModel() {
        return model;
    }

    public void setModel(MyModel model) {
        this.model = model;
    }

    public ViewActions getView() {
        return view;
    }

    public void setView(ViewActions view) {
        this.view = view;
    }
}
