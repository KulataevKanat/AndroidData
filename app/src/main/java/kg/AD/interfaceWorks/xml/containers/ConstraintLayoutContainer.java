package kg.AD.interfaceWorks.xml.containers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class ConstraintLayoutContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
        chapterButton();
    }

    private void chapterButton() {
        Button scroll_view = (Button) findViewById(R.id.next_sv);
        Button layout_change = (Button) findViewById(R.id.next_panel);
        scroll_view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_SCROLL_VIEW_LAYOUT);
                        startActivity(intent);
                    }
                }
        );

        layout_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_MAIN_PANEL_ELEMENT);
                        startActivity(intent);
                    }
                }
        );

    }
}