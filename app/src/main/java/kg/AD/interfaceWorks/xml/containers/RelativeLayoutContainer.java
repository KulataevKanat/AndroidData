package kg.AD.interfaceWorks.xml.containers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import kg.AD.R;
import kg.AD.begin.DisplayMessageActivity;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class RelativeLayoutContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        chapterButton();
    }

    public void sendRlMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.et_relative_layout);
        String message = editText.getText().toString();
        intent.putExtra(Strings.EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    private void chapterButton() {
        Button layout_change = (Button) findViewById(R.id.next_lg);
        Button layout_java_change = (Button) findViewById(R.id.next_rl_java_element);
        layout_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_GRAVITY_ELEMENT);
                        startActivity(intent);
                    }
                }
        );
        layout_java_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_RELATIVE_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
    }
}