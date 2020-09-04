package kg.AD.interfaceWorks.java.containerElements;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import kg.AD.values.Colors;
import kg.AD.values.Strings;

public class Indents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        TextView textView = new TextView(this);
        textView.setBackgroundColor(Color.parseColor(Colors.SILVER));
        textView.setText(Strings.HELLO_JAVA_ELEMENT);
        textView.setTextSize(26);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 200
        );
        layoutParams.setMargins(50, 50, 50, 50);
        textView.setLayoutParams(layoutParams);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);

    }


}