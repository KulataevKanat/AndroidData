package kg.AD.interfaceWorks.java.containers;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import kg.AD.values.Colors;
import kg.AD.values.Strings;

public class LinearLayoutContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        TextView textView0 = new TextView(this);

        TextView textView1 = new TextView(this);

        TextView textView2 = new TextView(this);

        textView0.setText(Strings.HELLO);
        textView0.setTextSize(40);
        textView0.setBackgroundColor(Color.parseColor(Colors.WHITE));

        textView1.setText(Strings.JAVA);
        textView1.setTextSize(40);
        textView1.setBackgroundColor(Color.parseColor(Colors.SILVER));

        textView2.setText(Strings.CODE);
        textView2.setTextSize(40);
        textView2.setBackgroundColor(Color.parseColor(Colors.GRAY));

        linearLayout.addView(textView0, new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );
        linearLayout.addView(textView1, new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                )
        );
        linearLayout.setWeightSum(4);
        linearLayout.setBackgroundColor(Color.parseColor(Colors.DARK_RED));
        setContentView(linearLayout);
    }
}