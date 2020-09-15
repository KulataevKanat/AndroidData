package kg.AD.interfaceWorks.java.elements;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import kg.AD.values.Colors;
import kg.AD.values.Strings;

public class GravityElement extends AppCompatActivity {

    @SuppressLint("RtlHardcoded")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);

        TextView textView = new TextView(this);
        textView.setText(Strings.HELLO_JAVA_INTERFACE);
        textView.setTextSize(30);
        textView.setBackgroundColor(Color.parseColor(Colors.DARK_VIOLET));

        //gravity
        textView.setGravity(Gravity.BOTTOM|Gravity.RIGHT);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                300);

        //layout_gravity
        layoutParams.gravity = Gravity.CENTER;
        textView.setLayoutParams(layoutParams);

        linearLayout.addView(textView);
        setContentView(linearLayout);
    }
}
