package kg.AD.resources.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class ResValues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_values);
        Button next_chapter = (Button) findViewById(R.id.next_chapter5);
        next_chapter.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Classes.ACTIVITY_CHAPTER);
            startActivity(intent);
        });
    }
}