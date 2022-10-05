package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TVNewsChannel extends Component {

    TVNewsChannel(String name, int authorityLevel, Mediator mediator) {
        super(name, authorityLevel, mediator);
    }

    public void broadcast(News news) {
        System.out.println("News broadcasted in video format");
    }
}
