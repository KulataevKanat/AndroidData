package kg.AD.chapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class InterfaceChapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_interface);
        chapterButton();
    }

    private void chapterButton() {
        Button layout_xml_change = (Button) findViewById(R.id.next_xml_element);
        Button layout_java_change = (Button) findViewById(R.id.next_java_element);
        layout_xml_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_ELEMENT);
                        startActivity(intent);
                    }
                }
        );
        layout_java_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_ELEMENT);
                        startActivity(intent);
                    }
                }
        );
    }
}