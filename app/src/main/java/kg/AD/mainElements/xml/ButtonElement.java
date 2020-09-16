package kg.AD.mainElements.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kg.AD.R;
import kg.AD.values.Classes;

public class ButtonElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        chapterButton();
    }

    public void sendEditText(View view) {
        TextView textView = (TextView) findViewById(R.id.tv_button);
        EditText editText = (EditText) findViewById(R.id.et_button);
        textView.setText(editText.getText());
    }

    private void chapterButton() {
        Button next_layout = (Button) findViewById(R.id.next_toast);
        Button next_java_element = (Button) findViewById(R.id.next_button_java_element);
        Button next_calc = (Button) findViewById(R.id.next_calc);

        next_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.BUTTON);
                        startActivity(intent);
                    }
                }
        );
        next_java_element.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_BUTTON);
                        startActivity(intent);
                    }
                }
        );
        next_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.CALCULATOR);
                startActivity(intent);
            }
        });
    }
}