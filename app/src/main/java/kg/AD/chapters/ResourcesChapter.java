package kg.AD.chapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class ResourcesChapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resourses);
        button();

    }

    private void button() {
        Button xml = (Button) findViewById(R.id.next_4_xml_element);
        Button next_layout = (Button) findViewById(R.id.next_str);

        xml.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Classes.XML_RES_VALUES);
            startActivity(intent);
        });

        next_layout.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Classes.JAVA_RES_VALUES);
            startActivity(intent);
        });
    }
}