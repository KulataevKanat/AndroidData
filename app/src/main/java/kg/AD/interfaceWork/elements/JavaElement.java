package kg.AD.interfaceWork.elements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import kg.AD.R;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class JavaElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView java = new TextView(this);
        java.setText(Strings.HELLO_JAVA_ELEMENT);
        java.setTextSize(30);
        setContentView(java);

    }
}