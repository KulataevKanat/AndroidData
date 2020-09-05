package kg.AD.interfaceWorks.java.containers;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import kg.AD.R;
import kg.AD.begin.DisplayMessageActivity;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class RelativeLayoutContainer extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = new RelativeLayout(this);

        EditText editText = new EditText(this);
        editText.setId(EditText.generateViewId());
        editText.setHint(Strings.RL_TEXT);

        Button button = new Button(this);
        button.setText(Strings.SEND);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Classes.DISPLAY_MESSAGE_ACTIVITY);
                        String message = editText.getText().toString();
                        intent.putExtra(Strings.EXTRA_MESSAGE, message);
                        startActivity(intent);
                    }
                }
        );

        RelativeLayout.LayoutParams editTextParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        relativeLayout.addView(editText, editTextParams);

        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonParams.addRule(RelativeLayout.BELOW, editText.getId());
        buttonParams.addRule(RelativeLayout.ALIGN_RIGHT, editText.getId());
        relativeLayout.addView(button, buttonParams);
        setContentView(relativeLayout);
    }
}
