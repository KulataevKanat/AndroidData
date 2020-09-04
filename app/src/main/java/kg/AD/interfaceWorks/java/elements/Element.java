package kg.AD.interfaceWorks.java.elements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import kg.AD.values.Strings;

public class Element extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView java = new TextView(this);
        java.setText(Strings.HELLO_JAVA_ELEMENT);
        java.setTextSize(30);
        setContentView(java);

    }
}