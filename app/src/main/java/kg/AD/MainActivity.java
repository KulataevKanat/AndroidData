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
        Button main_elements = (Button) findViewById(R.id.chapter3);
        Button resources = (Button) findViewById(R.id.chapter4);
        Button activity = (Button) findViewById(R.id.chapter5);
        Button image = (Button) findViewById(R.id.chapter6);
        Button adapters_and_lists = (Button) findViewById(R.id.chapter7);
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
        main_elements.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.MAIN_ELEMENTS_CHAPTER);
                        startActivity(intent);
                    }
                }
        );
        resources.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.RESOURCES_CHAPTER);
                        startActivity(intent);
                    }
                }
        );
        activity.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.ACTIVITY_CHAPTER);
                        startActivity(intent);
                    }
                }
        );
        image.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.IMAGE_CHAPTER);
                        startActivity(intent);
                    }
                }
        );
        adapters_and_lists.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.ADAPTERS_AND_LISTS_CHAPTER);
                        startActivity(intent);
                    }
                }
        );
    }
}