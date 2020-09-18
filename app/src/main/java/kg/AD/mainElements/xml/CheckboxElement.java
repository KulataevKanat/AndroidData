package kg.AD.mainElements.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import kg.AD.R;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class CheckboxElement extends AppCompatActivity {
    private TextView selection;
    private String selectedItems = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        button();
        snackbarClicked();
    }

    public void onCheckboxClicked(View view) {
        selection = (TextView) findViewById(R.id.selection);
        CheckBox python = (CheckBox) findViewById(R.id.cb_python);
        CheckBox kotlin = (CheckBox) findViewById(R.id.cb_kotlin);
        CheckBox java = (CheckBox) findViewById(R.id.cb_java);
        CheckBox js = (CheckBox) findViewById(R.id.cb_js);
        //Флажок

        python.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), Strings.PYTHON, Toast.LENGTH_SHORT).show();
                    selectedItems += python.getText() + "\n";
                    selection.setText(selectedItems);
                } else {
                    Toast.makeText(getApplicationContext(), Strings.PYTHON_UNCHECKED, Toast.LENGTH_SHORT).show();
                }
            }
        });

        kotlin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), Strings.KOTLIN, Toast.LENGTH_SHORT).show();
                    selectedItems += kotlin.getText() + "\n";
                    selection.setText(selectedItems);
                } else {
                    Toast.makeText(getApplicationContext(), Strings.KOTLIN_UNCHECKED, Toast.LENGTH_SHORT).show();
                }
            }
        });

        java.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), Strings.JAVA, Toast.LENGTH_SHORT).show();
                    selectedItems += java.getText() + "\n";
                    selection.setText(selectedItems);
                } else {
                    Toast.makeText(getApplicationContext(), Strings.JAVA_UNCHECKED, Toast.LENGTH_SHORT).show();
                }
            }
        });

        js.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), Strings.JS, Toast.LENGTH_SHORT).show();
                    selectedItems += js.getText() + "\n";
                    selection.setText(selectedItems);
                } else {
                    Toast.makeText(getApplicationContext(), Strings.JS_UNCHECKED, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void button() {
        Button next_layout = (Button) findViewById(R.id.next_tb);
        next_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.TOGGLE_BUTTON);
                startActivity(intent);
            }
        });
    }

    private void snackbarClicked() {
        selection = (TextView) findViewById(R.id.selection);
        CheckBox go = (CheckBox) findViewById(R.id.cb_go);
        go.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                go.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            Toast.makeText(getApplicationContext(), Strings.GO, Toast.LENGTH_SHORT).show();
                            selectedItems += go.getText() + "\n";
                            selection.setText(selectedItems);
                        } else {
                            Toast.makeText(getApplicationContext(), Strings.GO_UNCHECKED, Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}