package kg.AD.mainElements.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import kg.AD.R;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class ToastWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_window);
        chapterButton();
    }

    public void toastTop(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(),
                Strings.HELLO_TOP_TOAST,
                Toast.LENGTH_SHORT);
        toast.setGravity(
                Gravity.TOP,
                0,
                160);
        toast.show();
    }

    @SuppressLint("RtlHardcoded")
    public void toastLeft(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(),
                Strings.HELLO_LEFT_TOAST,
                Toast.LENGTH_SHORT);
        toast.setGravity(
                Gravity.LEFT,
                0,
                0);
        toast.show();
    }

    @SuppressLint("RtlHardcoded")
    public void toastRight(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(),
                Strings.HELLO_RIGHT_TOAST,
                Toast.LENGTH_SHORT);
        toast.setGravity(
                Gravity.RIGHT,
                0,
                0);
        toast.show();
    }

    private void chapterButton() {
        Button next_layout = (Button) findViewById(R.id.next_sb);
        Button toast_long = (Button) findViewById(R.id.tl);
        Button toast_short = (Button) findViewById(R.id.ts);

        next_layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.TOAST);
                        startActivity(intent);
                    }
                }
        );
        toast_long.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("RtlHardcoded")
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(
                                getApplicationContext(),
                                Strings.HELLO_LONG_TOAST,
                                Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
        );

        toast_short.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("RtlHardcoded")
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(
                                getApplicationContext(),
                                Strings.HELLO_SHORT_TOAST,
                                Toast.LENGTH_SHORT);
                        toast.setGravity(
                                Gravity.RIGHT | Gravity.TOP,
                                0,
                                0);
                        toast.show();
                    }
                }
        );
    }
}