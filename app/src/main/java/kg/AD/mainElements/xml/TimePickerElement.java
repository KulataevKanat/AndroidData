package kg.AD.mainElements.xml;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Formatter;

import kg.AD.R;

public class TimePickerElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        TextView timeDefault = (TextView) findViewById(R.id.timeDefault);
        TimePicker tp = (TimePicker) findViewById(R.id.timePicker);
        Formatter timeF = new Formatter();

        timeF.format("Время по умолчанию %d:%02d", tp.getCurrentHour(), tp.getCurrentMinute());
        timeDefault.setText(timeF.toString());
        tp.setIs24HourView(true);
        tp.setCurrentHour(10);
        tp.setCurrentMinute(10);
    }
}
