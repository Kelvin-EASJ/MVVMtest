package View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmtest.R;

import java.util.Observable;
import java.util.Observer;

import Model.Model;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public EditText editText;
    public Button button;
    Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        model.addObserver(new Observer() {

            //funktion updatere
            @Override
            public void update(Observable o, Object arg) {
                if (o instanceof Model) {
                    textView.setText(((Model) o).getString());
                }
            }
        });

    }
    public void changeText(View view) {
        String inputText = editText.getText().toString();
        model.setString(inputText);
    }
}

