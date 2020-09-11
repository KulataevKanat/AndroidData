package kg.AD.interfaceWorks.xml.elements;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kg.AD.R;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class MainPanel extends AppCompatActivity {
    private int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_panel);
        chapterButton();
        panelButtons();

    }

    private void panelButtons() {
        View rightButtonPanel = (View) findViewById(R.id.right_button_panel);
        View leftButtonPanel = (View) findViewById(R.id.left_button_panel);
        final TextView clicksText = (TextView) findViewById(R.id.clicksText);
        Button rightButton = rightButtonPanel.findViewById(R.id.click_button);
        Button leftButton = leftButtonPanel.findViewById(R.id.click_button);

        rightButton.setText(Strings.PLUS);
        leftButton.setText(Strings.MINUS);

        rightButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                clicks++;
                clicksText.setText(clicks + " Clicks");
            }
        });

        leftButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                clicks--;
                clicksText.setText(clicks + " Clicks");
            }
        });
    }

    private void chapterButton() {
        Button next_layout = (Button) findViewById(R.id.next_chapter_main_element);
        next_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Classes.MAIN_ELEMENTS_CHAPTER);
                        startActivity(intent);
                    }
                }
        );
    }
}