package kg.AD.chapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kg.AD.R;
import kg.AD.values.Classes;

public class AllContainers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_containers);
        chapterButton();
    }

    private void chapterButton() {
        Button linear_layout = (Button) findViewById(R.id.container1);
        Button relative_layout = (Button) findViewById(R.id.container2);
        Button table_layout = (Button) findViewById(R.id.container3);
        Button frame_layout = (Button) findViewById(R.id.container4);
        Button grid_layout = (Button) findViewById(R.id.container5);
        Button constraint_layout = (Button) findViewById(R.id.container6);
        Button scroll_view = (Button) findViewById(R.id.container7);

        linear_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_VERTICAL_LINEAR_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
        relative_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_RELATIVE_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
        table_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_TABLE_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
        frame_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_FRAME_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
        grid_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_GRID_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
        constraint_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_CONSTRAINT_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
        scroll_view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.JAVA_SCROLL_VIEW_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
    }
}