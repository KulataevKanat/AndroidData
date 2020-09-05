package kg.AD.interfaceWorks.xml.containers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class VerticalLinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_linear_layout);
        chapterButton();
    }

    private void chapterButton() {
        Button layout_change = (Button) findViewById(R.id.next_rl);
        Button layout_java_change = (Button) findViewById(R.id.next_ll_java_element);
        Button horizontal_change = (Button) findViewById(R.id.next_horizontal);
        layout_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_RELATIVE_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
        layout_java_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_LINEAR_LAYOUT);
                        startActivity(intent);
                    }
                }
        );

        horizontal_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_HORIZONTAL_LINEAR_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
    }
}