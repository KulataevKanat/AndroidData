package kg.AD.mainElements.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import kg.AD.R;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class RadioButtonElement extends AppCompatActivity {
    private TextView selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        selection = (TextView) findViewById(R.id.rb_text);
        switch (view.getId()) {
            case R.id.rb_java:
                if (checked) {
                    selection.setText(Strings.JAVA);
                }
                break;
            case R.id.rb_kotlin:
                if (checked) {
                    selection.setText(Strings.KOTLIN);
                }
                break;
        }
    }

    private void buttons() {
        Button layout_change = (Button) findViewById(R.id.next_pickers);
        RadioButton radioButton = (RadioButton) findViewById(R.id.rb_py);
        selection = (TextView) findViewById(R.id.rb_text);
        layout_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.RADIO_BUTTON);
                startActivity(intent);
            }
        });
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selection.setText(Strings.PYTHON);
                }
            }
        });

    }
}