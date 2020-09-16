package kg.AD.mainElements.xml;

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

public class EditTextElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        chapterButton();
    }

    private void chapterButton() {
        Button layout_change = (Button) findViewById(R.id.next_b);
        Button layoutApp = (Button) findViewById(R.id.layout_app);
        layout_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_EDIT_VIEW);
                        startActivity(intent);
                    }
                }
        );
        layoutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Classes.LAYOUT_APP);
                startActivity(intent);
            }
        });
    }
}