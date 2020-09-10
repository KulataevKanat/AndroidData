package kg.AD.interfaceWorks.xml.elements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class GravityElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gravity);
        chapterButton();
    }

    private void chapterButton() {
        Button next_layout = (Button) findViewById(R.id.next_tl);
        Button next_java_element = (Button) findViewById(R.id.next_gravity_java_element);
        next_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_GRAVITY_ELEMENT);
                        startActivity(intent);
                    }
                }
        );
        next_java_element.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_GRAVITY_ELEMENT);
                        startActivity(intent);
                    }
                }
        );
    }
}