package kg.AD.mainElements.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class TextViewElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        chapterButton();
    }

    private void chapterButton() {
        Button next_layout = (Button) findViewById(R.id.next_et);
        Button next_java_element = (Button) findViewById(R.id.tv_java_element);

        next_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_TEXT_VIEW);
                        startActivity(intent);
                    }
                }
        );
        next_java_element.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_TEXT_VIEW);
                        startActivity(intent);
                    }
                }
        );


    }
}