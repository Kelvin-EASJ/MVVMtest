package Model;


import android.content.SharedPreferences;
import android.util.Log;

import androidx.room.Entity;
import com.example.mvvmtest.MainActivity;


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


}


