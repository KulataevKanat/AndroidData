package kg.AD.interfaceWorks.java.containers;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import kg.AD.values.Strings;

public class FrameLayoutContainer extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = new FrameLayout(this);

        TextView textView = new TextView(this);
        textView.setText(Strings.HELLO_JAVA_INTERFACE);
        textView.setTextSize(30);

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM;

        textView.setLayoutParams(layoutParams);
        frameLayout.addView(textView);
        setContentView(frameLayout);
    }

}
