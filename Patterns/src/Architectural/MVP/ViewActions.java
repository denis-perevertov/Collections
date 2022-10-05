package Architectural.MVP;

public interface ViewActions {

    void update();
    void setPresenter(MyPresenter presenter);
    MyPresenter getPresenter();


}
