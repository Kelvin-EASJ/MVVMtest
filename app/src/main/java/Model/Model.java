package Model;

import java.util.Observable;


public class Model extends Observable {
    private String string;

    public String getString() {
       // Log.v("Model", "used getString");
        return string;
}
    //model updatere textview
    public void setString(String string) {
        this.string = string;
        setChanged();
        notifyObservers();
    }
}


