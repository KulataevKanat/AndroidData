package kg.AD.mainElements.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Formatter;

import kg.AD.R;
import kg.AD.values.Classes;

public class Pickers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickers);
        chapterButton();
    }

    private void chapterButton() {
        Button change_layout = (Button) findViewById(R.id.next_seekBar);
        Button dp = (Button) findViewById(R.id.next_dp);
        Button tp = (Button) findViewById(R.id.next_tp);

        change_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.SEEKBAR);
                startActivity(intent);
            }
        });

        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.DATE_PICKER);
                startActivity(intent);
            }
        });

        tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.TIME_PICKER);
                startActivity(intent);
            }
        });
    }
}

