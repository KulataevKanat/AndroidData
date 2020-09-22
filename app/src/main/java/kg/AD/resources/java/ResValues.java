package kg.AD.resources.java;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import kg.AD.R;

public class ResValues extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // получение ресурсов из файла strings.xml
        String hello_android = getResources().getString(R.string.hello_android);
        // получение ресурсов из файла colors.xml
        int hello_android_color = getResources().getColor(R.color.dark_green);
        // получение ресурсов из файла dimens.xml
        float hello_android_dimenSP = getResources().getDimension(R.dimen.twentiesSP);

        TextView textView = new TextView(this);
        textView.setText(hello_android);
        textView.setTextSize(hello_android_dimenSP);
        textView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        textView.setBackgroundColor(hello_android_color);
        setContentView(textView);
    }
}
