package kg.AD;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.values.Classes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chapterButton();
    }

    private void chapterButton() {
        Button begin = (Button) findViewById(R.id.chapter1);
        Button interface_work = (Button) findViewById(R.id.chapter2);
        begin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.BEGIN_CHAPTER);
                        startActivity(intent);
                    }
                }
        );
        interface_work.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.INTERFACE_CHAPTER);
                        startActivity(intent);
                    }
                }
        );
    }
}