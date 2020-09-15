package kg.AD.mainElements.java;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import kg.AD.values.Colors;
import kg.AD.values.Strings;

public class TextViewElement extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);

        TextView textView = new TextView(this);
        textView.setText(Strings.HELLO_JAVA_ELEMENT);
        textView.setTextSize(40);
        textView.setAllCaps(true);
        textView.setTextColor(Color.parseColor(Colors.BROWN));
        textView.setBackgroundColor(Color.parseColor(Colors.FOREST_GREEN));
        textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        textView.setTypeface(Typeface.create("cursive", Typeface.NORMAL));

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        layoutParams.setMargins(30, 30, 30, 30);
        linearLayout.addView(textView);
        setContentView(linearLayout);

    }
}
