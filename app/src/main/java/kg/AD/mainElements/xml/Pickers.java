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
        pickers();
        chapterButton();
    }

    @SuppressLint("SetTextI18n")
    public void pickers() {
        TextView dateDefault = (TextView) findViewById(R.id.dateDefault);
        TextView timeDefault = (TextView) findViewById(R.id.timeDefault);
        DatePicker dp = (DatePicker) findViewById(R.id.datePicker);
        TimePicker tp = (TimePicker) findViewById(R.id.timePicker);
        Formatter timeF = new Formatter();

        dateDefault.setText("Дата по умолчанию " +
                dp.getDayOfMonth() +
                "/" +
                (dp.getMonth() + 1) +
                "/" +
                dp.getYear()
        );
        dp.init(2020, 6, 4, null);

        timeF.format("Время по умолчанию %d:%02d", tp.getCurrentHour(), tp.getCurrentMinute());
        timeDefault.setText(timeF.toString());
        tp.setIs24HourView(true);
        tp.setCurrentHour(10);
        tp.setCurrentMinute(10);
    }

    private void chapterButton() {
        Button change_layout = (Button) findViewById(R.id.next_seekBar);

        change_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.PICKERS);
                startActivity(intent);
            }
        });
    }
}