package kg.AD.chapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class ActivityChapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        Button change_layout = (Button) findViewById(R.id.next_activity_methods);
        change_layout.setOnClickListener(v->{
            Intent intent = new Intent(getApplicationContext(), Classes.METHODS);
            startActivity(intent);
        });
    }
}