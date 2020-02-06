package Model;


import android.content.SharedPreferences;
import androidx.room.Entity;
import com.example.mvvmtest.MainActivity;


@Entity
public class Model extends MainActivity {



    // initialize SharedPreferences var
    SharedPreferences sharedPref;

        {

            // get or create SharedPreferences
            sharedPref = getSharedPreferences("myPref", MODE_PRIVATE);

            // save your string in SharedPreferences
            sharedPref.edit().putString("changedText", changedText).apply();

            String changedText = sharedPref.getString("changeText", "default if empty");

        }
    }