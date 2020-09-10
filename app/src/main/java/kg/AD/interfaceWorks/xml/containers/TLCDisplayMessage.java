package kg.AD.interfaceWorks.xml.containers;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;

import kg.AD.values.Strings;

public class TLCDisplayMessage extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        ArrayList<String> message = intent.getStringArrayListExtra(Strings.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("login - " + Objects.requireNonNull(message).get(0) + "\ngmail - " + message.get(1));
        setContentView(textView);
    }
}