package kg.AD.begin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import kg.AD.R;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class GraphicApplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphic_application);
        chapterButton();
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(Strings.EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    private void chapterButton() {
        Button layout_change = (Button) findViewById(R.id.next_chapter_interface);
        layout_change.setOnClickListener(
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