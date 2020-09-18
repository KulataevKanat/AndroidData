package kg.AD.mainElements.java;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import kg.AD.values.Strings;

public class ToggleButtonElement extends AppCompatActivity {

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        ToggleButton toggleButton = new ToggleButton(this);
        toggleButton.setTextOn(Strings.JAVA_ELEMENT);
        toggleButton.setTextOff(Strings.XML_ELEMENT);
        toggleButton.setTextSize(30);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()) {
                    Toast.makeText(getApplicationContext(), Strings.HELLO_JAVA_ELEMENT, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), Strings.HELLO_XML_ELEMENT, Toast.LENGTH_SHORT).show();
                }
            }
        });

        relativeLayout.addView(toggleButton, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        relativeLayout.setGravity(Gravity.CENTER);
        setContentView(relativeLayout);
    }
}
