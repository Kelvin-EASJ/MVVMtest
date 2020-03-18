package Model;



import android.util.Log; //  TODO Ubenyttet import
import java.util.Observable;
import java.util.Observer; //  TODO Ubenyttet import

import androidx.room.Entity; //  TODO Ubenyttet import




@Entity
public class Model /* TODO Nedarv fra Observable */ {
    private String string;

    public String getString() {
       // Log.v("Model", "used getString");
        return string;
    }

    public void setString(String string) {
        this.string = string;

        // TODO Notificer observere ved ændringer
    }
}


