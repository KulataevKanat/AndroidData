package kg.AD.mainElements.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import kg.AD.R;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class ToggleButtonElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        button();
    }

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            Toast.makeText(this, Strings.ON, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, Strings.OFF, Toast.LENGTH_SHORT).show();
        }
    }

    private void button() {
        Button next_layout = (Button) findViewById(R.id.next_rb);
        Button next_java_element = (Button) findViewById(R.id.next_tb_java_element);
        ToggleButton layout = (ToggleButton) findViewById(R.id.tb_container);
        next_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.TOGGLE_BUTTON);
                startActivity(intent);
            }
        });
        next_java_element.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.JAVA_TOGGLE_BUTTON);
                startActivity(intent);
            }
        });
        layout.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View v) {
                if (layout.isChecked()) {
                    Toast.makeText(getApplicationContext(), Strings.RELATIVE_LAYOUT, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), Strings.CONSTRAINT_LAYOUT, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}