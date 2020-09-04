package kg.AD.interfaceWorks.xml.containerElements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class Indents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indets);
        chapterButton();
    }

    private void chapterButton() {
        Button layout_change = (Button) findViewById(R.id.next_ll_container);
        Button layout_java_change = (Button) findViewById(R.id.next_indents_java_element);
        layout_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_VERTICAL_LINEAR_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
        layout_java_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_INDENTS);
                        startActivity(intent);
                    }
                }
        );
    }
}