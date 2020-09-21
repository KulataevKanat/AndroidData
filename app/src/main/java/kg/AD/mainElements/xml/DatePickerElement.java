package kg.AD.mainElements.xml;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Formatter;

import kg.AD.R;

public class DatePickerElement extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        TextView dateDefault = (TextView) findViewById(R.id.dateDefault);
        DatePicker dp = (DatePicker) findViewById(R.id.datePicker);
        dateDefault.setText("Дата по умолчанию " +
                dp.getDayOfMonth() +
                "/" +
                (dp.getMonth() + 1) +
                "/" +
                dp.getYear()
        );
        dp.init(2020, 6, 4, null);
    }
}
