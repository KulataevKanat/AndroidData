package kg.AD.begin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class HelloAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.begin_activity_android_hello);
        chapterButton();

    }

    private void chapterButton() {
        Button layout_change = (Button) findViewById(R.id.next_graphical);
        layout_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.GRAPHICAL_APPLICATION);
                        startActivity(intent);
                    }
                }
        );
    }
}