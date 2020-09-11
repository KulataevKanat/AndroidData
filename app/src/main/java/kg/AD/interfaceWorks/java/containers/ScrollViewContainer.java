package kg.AD.interfaceWorks.java.containers;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import kg.AD.values.Strings;

public class ScrollViewContainer extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        ScrollView scrollView = new ScrollView(this);

        TextView textView = new TextView(this);
        textView.setText(Strings.H +
                "\n" + Strings.E +
                "\n" + Strings.L +
                "\n" + Strings.L +
                "\n" + Strings.O +
                "\n" +
                "\n" + Strings.J +
                "\n" + Strings.A +
                "\n" + Strings.V +
                "\n" + Strings.A +
                "\n" +
                "\n" + Strings.I +
                "\n" + Strings.N +
                "\n" + Strings.T +
                "\n" + Strings.E +
                "\n" + Strings.R +
                "\n" + Strings.F +
                "\n" + Strings.A +
                "\n" + Strings.C +
                "\n" + Strings.E +
                "\n" + Strings.EXCLAMATION_POINT);

        textView.setTextSize(60);

        textView.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));

        scrollView.addView(textView);
        setContentView(scrollView);
    }
}
