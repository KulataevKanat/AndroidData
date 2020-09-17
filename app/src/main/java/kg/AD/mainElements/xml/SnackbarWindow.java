package kg.AD.mainElements.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

import kg.AD.R;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class SnackbarWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_window);
        chapterButton();
    }

    public void snackbarLong(View view) {
        Snackbar.make(view, Strings.HELLO_LONG_SNACKBAR, Snackbar.LENGTH_LONG).show();
    }

    private void chapterButton() {
        Button change_layout = (Button) findViewById(R.id.next_cb);
        Button snackbar_indefinite = (Button) findViewById(R.id.sb_i);
        Button snackbar_short = (Button) findViewById(R.id.sb_s);

        change_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.SNACKBAR);
                startActivity(intent);
            }
        });

        snackbar_indefinite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, Strings.HELLO_INDEFINITE_SNACKBAR, Snackbar.LENGTH_INDEFINITE).show();
            }
        });

        snackbar_short.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, Strings.HELLO_SHORT_SNACKBAR, Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}