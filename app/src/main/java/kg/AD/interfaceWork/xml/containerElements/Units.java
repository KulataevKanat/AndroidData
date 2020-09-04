package kg.AD.interfaceWork.xml.containerElements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class Units extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
        chapterButton();
    }

    private void chapterButton() {
        Button layout_change = (Button) findViewById(R.id.next_indents);
        Button layout_java_change = (Button) findViewById(R.id.next_units_java_element);
        layout_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_INDENTS);
                        startActivity(intent);
                    }
                }
        );
        layout_java_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_UNITS);
                        startActivity(intent);
                    }
                }
        );
    }

}