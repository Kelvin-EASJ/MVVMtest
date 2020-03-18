package Model;



import android.util.Log;
import java.util.Observable;
import java.util.Observer;

import androidx.room.Entity;




@Entity
public class Model {
    private String string;

    public String getString() {
       // Log.v("Model", "used getString");
        return string;
    }

    public void setString(String string) {
        this.string = string;


    }
}


