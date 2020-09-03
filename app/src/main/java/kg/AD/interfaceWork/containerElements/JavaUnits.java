package kg.AD.interfaceWork.containerElements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import kg.AD.values.Strings;

public class JavaUnits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        TextView textView = new TextView(this);
        textView.setText(Strings.JAVA_UNIT_ELEMENT);
        textView.setTextSize(30);

        textView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 300));

        relativeLayout.addView(textView);
        setContentView(relativeLayout);
    }
}