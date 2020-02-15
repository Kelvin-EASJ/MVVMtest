package Model;



import android.util.Log;
import java.util.Observable;
import java.util.Observer;

import androidx.room.Entity;




@Entity
public class Model {
    private String string;

    public String getString() {
        Log.v("Model", "used getString");
        return string;
    }

    public void setString(String string) {
        this.string = string;


    }
    public static class MyObserver implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println(arg + " " + ((MyObservable)o).name);
        }
    }

    public static class MyObservable extends Observable {

        public String name = "Observable";

        public void changeMe(String word) {
            setChanged();
            notifyObservers(word);
        }
    }

    public static class Test {
        public static void main(String[] args) {
            MyObservable myObservable = new MyObservable();
            myObservable.addObserver(new MyObserver());
            myObservable.changeMe("Change detected in");
        }
    }


}


